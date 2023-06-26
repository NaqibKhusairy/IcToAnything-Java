import java.util.Scanner;

class IcToAnything {
    String Nama, Ic, nomatric, DOB, gend, from, AskUser;
    String Star = "\n*******************************************\n";
    int tahun, bulan, hari, umur, jantina, negeri;

    public void input() {
        Scanner Input = new Scanner(System.in);

        System.out.print(Star);
        System.out.print("      Welcome To Ic To Anything System");
        System.out.print(Star);
        System.out.print("Name : ");
        Nama = Input.nextLine();
        Nama = Nama.toUpperCase();
        System.out.print("Ic : ");
        Ic = Input.nextLine();
        System.out.print("No.Matric : ");
        nomatric = Input.nextLine();
        nomatric = nomatric.toUpperCase();
    }

    public void bfday() {
        tahun = Integer.parseInt(Ic.substring(0, 2));
        if (tahun >= 0 && tahun <= 24) {
            tahun += 2000;
        } else {
            tahun += 1900;
        }
        umur = 2023 - tahun;
        bulan = Integer.parseInt(Ic.substring(2, 4));
        hari = Integer.parseInt(Ic.substring(4, 6));
        DOB = hari + "/" + bulan + "/" + tahun;
    }

    public void Jntina() {
        jantina = Integer.parseInt(Ic.substring(11));
        jantina %= 2;
        if (jantina == 0) {
            gend = "Female";
        } else {
            gend = "Male";
        }
        gend = gend.toUpperCase();
    }

    public void Negeriasal() {
        negeri = Integer.parseInt(Ic.substring(6, 8));
        if (negeri == 1 || negeri == 21 || negeri == 22 || negeri == 23 || negeri == 24) {
            from = "Johor";
        } else if (negeri == 2 || negeri == 25 || negeri == 26 || negeri == 27) {
            from = "Kedah";
        } else if (negeri == 3 || negeri == 28 || negeri == 29) {
            from = "Kelantan";
        } else if (negeri == 4 || negeri == 30) {
            from = "Melaka";
        } else if (negeri == 5 || negeri == 31 || negeri == 59) {
            from = "Negeri Sembilan";
        } else if (negeri == 6 || negeri == 32 || negeri == 33) {
            from = "Pahang";
        } else if (negeri == 7 || negeri == 34 || negeri == 35) {
            from = "Pulau Pinang";
        } else if (negeri == 8 || negeri == 36 || negeri == 37 || negeri == 38 || negeri == 39) {
            from = "Perak";
        } else if (negeri == 9 || negeri == 40) {
            from = "Perlis";
        } else if (negeri == 10 || negeri == 41 || negeri == 42 || negeri == 43 || negeri == 44) {
            from = "Selangor";
        } else if (negeri == 11 || negeri == 45 || negeri == 46) {
            from = "Terengganu";
        } else if (negeri == 12 || negeri == 47 || negeri == 48 || negeri == 49) {
            from = "Sabah";
        } else if (negeri == 13 || negeri == 50 || negeri == 51 || negeri == 52 || negeri == 53) {
            from = "Sarawak";
        } else if (negeri == 14 || negeri == 54 || negeri == 55 || negeri == 56 || negeri == 57) {
            from = "Kuala Lumpur";
        } else if (negeri == 15 || negeri == 58) {
            from = "Labuan";
        } else if (negeri == 16) {
            from = "Putrajaya";
        } else {
            from = "State Unknown";
        }
        from = from.toUpperCase();
    }

    public void Output() {
        bfday();
        Jntina();
        Negeriasal();
        System.out.print(Star);
        System.out.print(" Thank you for using Ic To Anything System");
        System.out.print(Star);
        System.out.println("Name : " + Nama);
        System.out.println("Ic : " + Ic);
        System.out.println("No.Matric : " + nomatric);
        System.out.println("Date Of Birth : " + DOB);
        System.out.println("Age : " + umur);
        System.out.println("Gender : " + gend);
        System.out.println("State Of Birth : " + from);
        System.out.print(Star);
    }

    public static void main(String args[]) {
        IcToAnything ictoanything = new IcToAnything();
        do {
            ictoanything.input();
            ictoanything.Output();
            Scanner User = new Scanner(System.in);
            System.out.print("Insert Y to Continue Calculate or press Enter to Exit = ");
            ictoanything.AskUser = User.nextLine();
            ictoanything.AskUser = ictoanything.AskUser.toUpperCase();
        } 
		while (ictoanything.AskUser.equals("Y"));
    }
}
