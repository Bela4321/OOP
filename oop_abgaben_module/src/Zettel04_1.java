public class Zettel04_1 {
    //a)
    String fillWithCharacter (String string,int totalLenght,String Character) {
        while (string.length() < totalLenght) {
            string = Character + string + Character;
        }
        return string;
    }


    public void showBillboard (String message) {
        if (message.length() > 84) {
            System.out.println("Messages over 84 characters cant be displayed, sorry :(");
            return;
        }
        if (message.length() % 2 == 0) {
            message= message + " ";
        }
        int length = Math.max(message.length() + 4, 21);
        String head1 = "\\|||||/";
        String head2 = "( O O )";
        String UpperHand = "ooO-----(_)--------";
        String blankLine = " ";
        String lowerHand = "----------------Ooo";
        String legs1 = "|_| |_|";
        String legs2 = "|| ||";
        String legs3 = "ooO Ooo";

        System.out.println(fillWithCharacter(head1,length," "));
        System.out.println(fillWithCharacter(head2,length," "));
        System.out.println("|"+fillWithCharacter(UpperHand,length-2,"-")+"|");
        System.out.println("|"+fillWithCharacter(blankLine,length-2," ")+"|");
        System.out.println("| "+fillWithCharacter(message,length-4," ")+" |");
        System.out.println("|"+fillWithCharacter(blankLine,length-2," ")+"|");
        System.out.println("|"+fillWithCharacter(lowerHand,length-2,"-")+"|");
        System.out.println(fillWithCharacter(legs1,length," "));
        System.out.println(fillWithCharacter(legs2,length," "));
        System.out.println(fillWithCharacter(legs3,length," "));
    }
    //b)
    showBillboard("Testing your own code is important");
    showBillboard("Testing your program with all kinds of different input values is important!");
    showBillboard("");
    showBillboard("");
    showBillboard("Der Teig fuer die meisten Ramen besteht aus den Grundbestandteilen Weizenmehl, Salz und Wasser und Kansui (alkalisches Wasser). Der Zusatz Kansui, bestehend aus einem hohen Anteil an Kaliumcarbonat und Natriumcarbonat sowie Spuren von Phosphorsaeure, verleiht den Nudeln ihre spezielle gelbliche Farbe und ihren spezifischen Geschmack. Teilweise werden auch Eier anstatt Kansui verwendet, es gibt aber auch Nudeln ganz ohne Kansui und Eier. Insgesamt werden vier Grundtypen unterschieden: Kansomen (getrocknete Ramen), Namamen (frische Ramen), Mushimen (gedämpfte Ramen) sowie Insutanto Ramen (Instantramen). Waehrend die frischen Ramen moeglichst am Herstellungstag verwendet oder nur kurz im Kuehlschrank gelagert werden sollten, sind Instantramen zum Teil mehrere Monate lagerfaehig. Ramen gibt es in verschiedene Formen, wie beispielsweise als dicke oder duenne Nudeln, als lange und kurze Nudeln, oder auch als glatte, verknaeuelte, bandartige Nudelform.");
}
