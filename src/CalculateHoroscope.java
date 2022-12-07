import java.util.Scanner;

public class CalculateHoroscope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month, day;
        String horoscope = " ";
        boolean isError = false;

        System.out.println("The month of birth must be entered as follows\n1 for January\n2 for February etc.");
        System.out.print("Enter your month of birth: ");
        month = scanner.nextInt();

        System.out.print("Enter your day of birth: ");
        day = scanner.nextInt();

        if ((month >= 1) && (month <= 12)) {
            if (month == 1) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 19) {
                        horoscope = "Capricorn";
                    } else {
                        horoscope = "Aquarius";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 2) {
                if ((day >= 1) && (day <= 28)) {
                    if (day <= 18) {
                        horoscope = "Aquarius ";
                    } else {
                        horoscope = "Pisces";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 3) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 20) {
                        horoscope = "Pisces";
                    } else {
                        horoscope = "Aries ";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 4) {
                if ((day >= 1) && (day <= 30)) {
                    if (day <= 19) {
                        horoscope = "Aries ";
                    } else {
                        horoscope = "Taurus";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 5) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 20) {
                        horoscope = "Taurus";
                    } else {
                        horoscope = "Gemini";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 6) {
                if ((day >= 1) && (day <= 30)) {
                    if (day <= 20) {
                        horoscope = "Gemini";
                    } else {
                        horoscope = "Cancer";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 7) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 22) {
                        horoscope = "Cancer";
                    } else {
                        horoscope = "Leo";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 8) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 22) {
                        horoscope = "Leo";
                    } else {
                        horoscope = "Virgo";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 9) {
                if ((day >= 1) && (day <= 30)) {
                    if (day <= 22) {
                        horoscope = "Virgo";
                    } else {
                        horoscope = "Libra";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 10) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 22) {
                        horoscope = "Libra";
                    } else {
                        horoscope = "Scorpio";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 11) {
                if ((day >= 1) && (day <= 30)) {
                    if (day <= 21) {
                        horoscope = "Scorpio";
                    } else {
                        horoscope = "Sagittarius";
                    }
                } else {
                    isError = true;
                }
            } else {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 21) {
                        horoscope = "Sagittarius";
                    } else {
                        horoscope = "Capricorn";
                    }
                } else {
                    isError = true;
                }
            }
            if (isError) {
                System.out.print("Invalid Input!");
            } else {
                System.out.print("Your horoscope: " + horoscope);
            }
        } else {
            System.out.print("Invalid value for the month!\nTry again.");
        }
    }
}
