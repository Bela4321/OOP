package Zettel06;

public class präsenz06michel {

// 6.1
static int facultyTailH (int n, int f) {
    if (n == 1 || n == 0) {
        return 1;
    }
    f = n * facultyTailH(n - 1, 0);
    return f;
}

    static int facultyTailRec (int n) {
        return facultyTailH(n, 0);
    }


// 6.2
    public String title, author, isbn;

    präsenz06michel(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }

    static präsenz06michel eins = new präsenz06michel("Homo Deus", "Yusuf", "3406704018");
    static präsenz06michel zwei = new präsenz06michel("21 Lektionen", "Harari", "9783406727788");
    static präsenz06michel drei = new präsenz06michel("Kurze Geschicht", "baba", "342104855X");


// 6.3
    static boolean doubleEqual (double a, double b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    static boolean doubleEqualDelta (double a, double b, double d) {
        if (Math.abs(a - b) < d) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(facultyTailRec (6)); //6.1 output

        System.out.println(doubleEqual(3.4, 3.4)); // 6.3 output
        System.out.println(doubleEqual(0.2 + 0.1,0.3));
        System.out.println(doubleEqualDelta(3.4, 2.1, 7.5));
        System.out.println(doubleEqualDelta(0.2 + 0.1, 0.3, 0.00000001));

        präsenz06michel.eins.title; // 6.2 output ERROR
    }
}

