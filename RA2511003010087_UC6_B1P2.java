public class test {
    public static String[] GenerateO(){
        return new String[]{
            "   ***    ",
            " **   **  ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            " **   **  ",
            "   ***    "
        };
    }
    public static String[] GenerateP(){
        return new String[]{
            "******    ",
            "**    **  ",
            "**     ** ",
            "**    **  ",
            "******    ",
            "**        ",
            "**        ",
            "**        ",
            "**        "
        };
    }
    public static String[] GenerateS(){
        return new String[]{
            "  *****",
            " **",
            "**",
            " **",
            "  ***",
            "     **",
            "      **",
            "     **",
            " *****"
        };
    }
	public static void main(String[] args) {
		String[] O = GenerateO(), P = GenerateP(), S = GenerateS();
        for (int i = 0; i < 9; i++){
            System.out.println(O[i] + O[i] + P[i] +S[i]);
        }
	}
}
