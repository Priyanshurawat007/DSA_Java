import java.util.Scanner;
public class ReturnWeeek {
    public static String findDay(int month, int day, int year) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                                   "August", "September", "October", "November", "December"};
                
                
                String[] daysOfWeek = {"SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDY", "FRIDAY"};
                
                
                if (month < 3) {
                    month += 12;
                    year--;
                }
                
                // Zeller's Congruence algorithm
                int q = day;
                int m = month;
                int K = year % 100;
                int J = year / 100;
                int h = (q + ((13 * (m + 1)) / 5) + K + (K / 4) + (J / 4) + (5 * J)) % 7;
                
                // Return the day of the week
                return daysOfWeek[h];
            }
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                
                
                System.out.println("Enter the month (1-12):");
                int month = scanner.nextInt();
                System.out.println("Enter the day (1-31):");
                int day = scanner.nextInt();
                System.out.println("Enter the year:");
                int year = scanner.nextInt();
                
                
                String result = findDay(month, day, year);
                System.out.println("The day on " + month + "/" + day + "/" + year + " was: " + result);
                
                scanner.close();
            }
        }
    

