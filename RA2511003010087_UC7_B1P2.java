import java.util.ArrayList;

class CharacterPattern{
    public ArrayList<Character> characters = new ArrayList<>();
    public ArrayList<String[]> patterns = new ArrayList<>();

    public String getPattern(char character, String[] pattern){
        characters.add(character);
        patterns.add(pattern);  
        return "Pattern added"; 
    }

    public String[] givePattern(char character){
        for (int i = 0; i < characters.size(); i++){
            if (characters.get(i) == character){
                return patterns.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args){
        CharacterPattern cp = new CharacterPattern();
        cp.getPattern('O', new String[]{
            "   ***    ",
            " **   **  ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            " **   **  ",
            "   ***    "});
        cp.getPattern('P', new String[]{
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
        cp.getPattern('S', new String[]{
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
        for (int i = 0; i < 9; i++){
            String line = "";
            for (char ch : word.toCharArray()){
                String[] pat = cp.givePattern(ch);
                if (pat != null){
                    line = line + pat[i];
                }
            }
            System.out.println (line);
        }
    }
}
