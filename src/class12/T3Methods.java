package class12;
/*
Create a method createEmail(). Based on values of users firstName, lastName and email type,
your method should return complete email Address.
Example: createEmail(John, Snow, gmail) johnsnow@gmail.com
 */
public class T3Methods {
    String createEmail(String firstName, String lastName, String emailType){

        return firstName+lastName+"@"+emailType+".com";
        }

    }

