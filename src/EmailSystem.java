/**
 * This is the EmailSystem class, which sends a verification email to a user after
 * successfully purchasing products from the store.
 * @ authors: Lyle
 * @ date of oldest edition: April 15
 * @ version: 2 
 */

//package src;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSystem {

    private String fromEmail; // Sender's email ID
    private String password;  // Sender's email password for SMTP authentication

    /**
     * EmailSystem class constructor: it takes in the sender's email ID
     * and the sender's email password for SMTP authentication
     */

    public EmailSystem(String fromEmail, String password) {
        this.fromEmail = fromEmail;
        this.password = password;
    }

    /**
     * sendOrderUpdate method: it takes in the user's email, the subject of the email, 
     * and the email's message. This method creates an automated email and sends it to
     * the user.
     */

    public void sendOrderUpdate(String toEmail, String subject, String messageBody) {
        // Assuming you're using SMTP server of Gmail
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            // Create a default MimeMessage object
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header
            message.setFrom(new InternetAddress(fromEmail));

            // Set To: header field of the header
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));

            // Set Subject: header field
            message.setSubject(subject);

            // Set the actual message
            message.setText(messageBody);

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
