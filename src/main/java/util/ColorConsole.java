package util;

public class ColorConsole {
    // LOGGER:
    // -------
    // DEBUG
    // TRACE
    // ERROR
    // WARNING
    // CRITICAL

    // Reset
    public static final String RESET = "\u001B[0m";

    // Regular Colors
    public static final String BLACK   = "\u001B[30m";
    public static final String RED     = "\u001B[31m";
    public static final String GREEN   = "\u001B[32m";
    public static final String YELLOW  = "\u001B[33m";
    public static final String BLUE    = "\u001B[34m";
    public static final String PURPLE  = "\u001B[35m";
    public static final String CYAN    = "\u001B[36m";
    public static final String WHITE   = "\u001B[37m";

    // Bold
    public static final String BLACK_BOLD  = "\033[1;30m";
    public static final String RED_BOLD    = "\033[1;31m";
    public static final String GREEN_BOLD  = "\033[1;32m";
    public static final String YELLOW_BOLD = "\033[1;33m";
    public static final String BLUE_BOLD   = "\033[1;34m";
    public static final String PURPLE_BOLD = "\033[1;35m";
    public static final String CYAN_BOLD   = "\033[1;36m";
    public static final String WHITE_BOLD  = "\033[1;37m";

    // Underline
    public static final String BLACK_ULINE  = "\033[4;30m";
    public static final String RED_ULINE    = "\033[4;31m";
    public static final String GREEN_ULINE  = "\033[4;32m";
    public static final String YELLOW_ULINE = "\033[4;33m";
    public static final String BLUE_ULINE   = "\033[4;34m";
    public static final String PURPLE_ULINE = "\033[4;35m";
    public static final String CYAN_ULINE   = "\033[4;36m";
    public static final String WHITE_ULINE  = "\033[4;37m";

    // Backgrounds
    public static final String BLACK_BKG    = "\033[40m";
    public static final String RED_BKG      = "\033[41m";
    public static final String GREEN_BKG    = "\033[42m";
    public static final String YELLOW_BKG   = "\033[43m";
    public static final String BLUE_BKG     = "\033[44m";
    public static final String PURPLE_BKG   = "\033[45m";
    public static final String CYAN_BKG     = "\033[46m";
    public static final String WHITE_BKG    = "\033[47m";
    
    // High Intensity
    public static final String BLACK_BRIGHT     = "\033[0;90m";
    public static final String RED_BRIGHT       = "\033[0;91m";
    public static final String GREEN_BRIGHT     = "\033[0;92m";
    public static final String YELLOW_BRIGHT    = "\033[0;93m";
    public static final String BLUE_BRIGHT      = "\033[0;94m";
    public static final String PURPLE_BRIGHT    = "\033[0;95m";
    public static final String CYAN_BRIGHT      = "\033[0;96m";
    public static final String WHITE_BRIGHT     = "\033[0;97m";

    // Bold + High Intensity
    public static final String BLACK_BOLD_BRIGHT    = "\033[1;90m";
    public static final String RED_BOLD_BRIGHT      = "\033[1;91m";
    public static final String GREEN_BOLD_BRIGHT    = "\033[1;92m";
    public static final String YELLOW_BOLD_BRIGHT   = "\033[1;93m";
    public static final String BLUE_BOLD_BRIGHT     = "\033[1;94m";
    public static final String PURPLE_BOLD_BRIGHT   = "\033[1;95m";
    public static final String CYAN_BOLD_BRIGHT     = "\033[1;96m";
    public static final String WHITE_BOLD_BRIGHT    = "\033[1;97m";

    // High Intensity Backgrounds
    public static final String BLACK_BKG_BRIGHT     = "\033[0;100m";
    public static final String RED_BKG_BRIGHT       = "\033[0;101m";
    public static final String GREEN_BKG_BRIGHT     = "\033[0;102m";
    public static final String YELLOW_BKG_BRIGHT    = "\033[0;103m";
    public static final String BLUE_BKG_BRIGHT      = "\033[0;104m";
    public static final String PURPLE_BKG_BRIGHT    = "\033[0;105m";
    public static final String CYAN_BKG_BRIGHT      = "\033[0;106m";
    public static final String WHITE_BKG_BRIGHT     = "\033[0;107m";

    public static void cprint(String message, String color) {
        switch(color.toLowerCase()) {
            case "red":
                System.out.println(RED + message + RESET);
                break;
            case "green":
                System.out.println(GREEN + message + RESET);
                break;
            case "blue":
                System.out.println(BLUE + message + RESET);
                break;
            case "yellow":
                System.out.println(YELLOW + message + RESET);
                break;
            case "purple":
                System.out.println(PURPLE + message + RESET);
                break;
            case "cyan":
                System.out.println(CYAN + message + RESET);
                break;
            default:
                assert false : "Invalid color: '" + color + "'";
                break;
        }


    }
}
