import java.util.ArrayList;

class CharacterPattern{
    public ArrayList<Character> characters = new ArrayList<>();
    public ArrayList<String[]> patterns = new ArrayList<>();

    public String GetPattern(char character, String[] pattern){
        characters.add(character);
        patterns.add(pattern);  
        return "Pattern added"; 
    }

    public String[] GivePattern(char character){
        for (int i = 0; i < characters.size(); i++){
            if (characters.get(i) == character){
                return patterns.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args){
        CharacterPattern cp = new CharacterPattern();
        cp.GetPattern('O', new String[]{
            "   ***    ",
            " **   **  ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            " **   **  ",
            "   ***    "});
        cp.GetPattern('P', new String[]{
            "******    ",
            "**    **  ",
            "**     ** ",
            "**    **  ",
            "******    ",
            "**        ",
            "**        ",
            "**        ",
            "**        "
        });
        cp.GetPattern('S', new String[]{
            "  *****  ",
            " **      ",
            "**       ",
            " **      ",
            "  ***    ",
            "     **  ",
            "      ** ",
            "     **  ",
            " *****   "
        });
        String word = "OOPS";
        for (char ch : word.toCharArray()){
            String[] pat = cp.GivePattern(ch);
            if (pat != null){
                for (String line : pat){
                    System.out.println(line);
                }
            }
        }
    }
}
