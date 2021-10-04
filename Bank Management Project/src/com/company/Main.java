package com.company;

import java.lang.Math;
import java.lang.String;
import java.lang.Integer;
import java.util.Date;
import java.util.Scanner;                           //The Program Is Coded By Basanta Chaudhary

// The Bank Management Project Of My Office
class Bank_DEscription {
    void BankAbout() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t                    WELCOME");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🏦🏦🏦🏦");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t  SARVOTTAM MULTIPURPOSE CO-OPERATIVE LTD,BAGBAAZAR,KTM,NEPAL");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t          TEL_NO:014456647,0177744483");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }

    void FOOTER_PAGE() {
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDeveloped By Basanta Chaudhary");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      THANK YOU ❤💚🤍");
    }
}

class Data_Declares {
    String[] date = new String[1000];
    int[] age = new int[100];
    String[] Locations = new String[100];
    String[] EmailId = new String[100];
    long[] contact = new long[100];
    long[] Amount = new long[100];
    char[] sex = new char[100];
    String id;
    int[] charge = new int[100];
    String[] First_Name = new String[100];
    String[] Last_Name = new String[100];

}

class CreateNew_Account extends Data_Declares {
    int n, i;
    String word = "";

    void Get_DAtaFrom_User() {
        Scanner aa = new Scanner(System.in);
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t   How Many Customers There Are.....?");
        n = aa.nextInt();
        if (n == 1) {
            word = "One";
        } else if (n == 2) {
            word = "Two";
        } else if (n == 3) {
            word = "Three";
        } else if (n == 4) {
            word = "Four";
        } else if (n == 5) {
            word = "Five";
        } else if (n == 6) {
            word = "Six";
        } else if (n == 7) {
            word = "Seven";
        } else if (n == 8) {
            word = "Eight";
        } else if (n == 9) {
            word = "Nine";
        } else if (n == 10) {
            word = "Ten";
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t      There are " + word + " Customers ❗");
        System.out.println();
        for (i = 0; i < n; i++) {
            System.out.println();
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t            Customer[" + i + "]");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t            -----------");
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tENTER  FIRST-NAME  :");
            First_Name[i] = aa.next();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tENTER  LAST -NAME  :");
            Last_Name[i] = aa.next();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tENTER   AGE  :");
            age[i] = aa.nextInt();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tENTER  SEX 👨‍:");
            sex[i] = aa.next().charAt(0);
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tENTER  EMAILE:");
            EmailId[i] = aa.next();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tENTER CONTACT:");
            contact[i] = aa.nextLong();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tENTER ADDRESS:");
            Locations[i] = aa.next();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tENTER CHARGE :");
            charge[i] = aa.nextInt();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tENTER  Date  🕐:");
            date[i] = aa.next();

        }
    }

    void Display_Customers_NewAccount() {
        System.out.println("S.N    FIRST-NAME     LAST-NAME      AGE      SEX                 EMAILE-ID                 CONTACT         ADDRESS         SERVICES-CHARGE        Date  🕐");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (i = 0; i < n; i++) {
            System.out.println(i + "      " + First_Name[i] + "        " + Last_Name[i] + "      " + age[i] + "       " + sex[i] + "        " + EmailId[i] + "      " + contact[i] + "      " + Locations[i] + "         " + charge[i] + "             " + date[i]);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner give = new Scanner(System.in);
        String who;
        int n = 0;
        Bank_DEscription dEscription = new Bank_DEscription();
        dEscription.BankAbout();
        Deposit_AmountInThe_Bank DEposited = new Deposit_AmountInThe_Bank();
        Scanner SC = new Scanner(System.in);
        CreateNew_Account newAccount = new CreateNew_Account();
        Searchig_CustomersWithID id = new Searchig_CustomersWithID();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWho Are You..👨‍💻.❓ ");
        who = SC.nextLine();
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Namaste 👨‍,  " + who + " ❗");

        System.out.println();
        char NEXT_TIME = 'y';
        String User, Pass;
        String branch_Code, date;
        do {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t------------------------------");
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t| ENTER USER_NAME  :");
            User = SC.next();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t| ENTER  PASSWORD  :");
            Pass = SC.next();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t| ENTER BRANCH-CODE:");
            branch_Code = SC.next();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t| ENTER DD--MM--YY :");
            date = SC.next();
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t------------------------------");
            if (User.equals("Basanta") && Pass.equals("*******")) {
                if (branch_Code.equals("001") || branch_Code.equals("127") || branch_Code.equals("324")) {
                    if (date.equals("21-21-2021")) {
                        while (NEXT_TIME == 'y') {
                            System.out.println();
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDATA ACCESS ❗");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t[1].Do You Want Create a New Account ❗");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t[2].Do You Want Show Customers Records ❗");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t[3].Do You Want Amount Deposit In Your Account ❗");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t[4].Do You Want Your Account Balance Enquiry ❗");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t[5].Do You Want Cash_Draw From Your Account ❗");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t[6].Do You Want Search Customers Account With ID_NO ❗");
                            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t[7].Do You Want Exit ❗");
                            n = SC.nextInt();
                            if (n == 1) {
                                newAccount.Get_DAtaFrom_User();
                            } else if (n == 2) {
                                newAccount.Display_Customers_NewAccount();
                            } else if (n == 3) {
                                DEposited.Deposit();
                            } else if (n == 4) {
                                System.out.println();
                                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  ENTER  PIN_CODE :");
                                Pass = SC.next();
                                System.out.println();
                                if (Pass.equals("1010")) {
                                    DEposited.Deposite_AmountDetail();
                                }
                            } else if (n == 5) {
                                System.out.println();
                                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t            SARVOTTAM  🏤 ATM ");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t            -----------------");
                                System.out.println();
                                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  ENTER  PIN_CODE :");
                                Pass = SC.next();
                                System.out.println();
                                if (Pass.equals("1010")) {
                                    DEposited.Cash_Draw();
                                } else {
                                    System.out.println();
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t     Sorry,Not Matched Your Pin_Code❗");
                                    System.out.println();
                                }
                            } else if (n == 6) {
                                System.out.println();
                                id.Get_ID_N0();
                            } else if (n == 7) {
                                System.out.println();
                                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                System.out.println();
                                do {
                                    System.out.println("\\u00c");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t------------------------------");
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t| ENTER USER_NAME  :");
                                    User = SC.next();
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t| ENTER  PASSWORD  :");
                                    Pass = SC.next();
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t| ENTER BRANCH-CODE:");
                                    branch_Code = SC.next();
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t| ENTER DD--MM--YY :");
                                    date = SC.next();
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t------------------------------");
                                    if (User.equals("Basanta") && Pass.equals("*******")) {
                                        if (branch_Code.equals("001") || branch_Code.equals("127") || branch_Code.equals("324")) {
                                            if (date.equals("21-21-2021")) {
                                                while (NEXT_TIME == 'y') {
                                                    System.out.println();
                                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t[1].Do You Want Create a New Account ❗");
                                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t[2].Do You Want Show Customers Records ❗");
                                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t[3].Do You Want Amount Deposit In Your Account ❗");
                                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t[4].Do You Want Your Account Balance Enquiry ❗");
                                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t[5].Do You Want Cash_Draw From Your Account ❗");
                                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t[6].Do You Want Search Customers Account With ID_NO ❗");
                                                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t[7].Do You Want Exit ❗");
                                                    n = SC.nextInt();
                                                    if (n == 1) {
                                                        newAccount.Get_DAtaFrom_User();
                                                    } else if (n == 2) {
                                                        newAccount.Display_Customers_NewAccount();
                                                    } else if (n == 3) {
                                                        DEposited.Deposit();
                                                    } else if (n == 4) {
                                                        DEposited.Deposite_AmountDetail();
                                                    } else if (n == 5) {
                                                        System.out.println();
                                                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t              SARVOTTAM   🏤 ATM ");
                                                        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t              ------------------");
                                                        System.out.println();
                                                        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\tENTER USER_NAME :");
                                                        User = SC.next();
                                                        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\tENTER  PIN_CODE :");
                                                        Pass = SC.next();
                                                        System.out.println();
                                                        if (User.equals("Basanta") && Pass.equals("1010")) {
                                                            DEposited.Cash_Draw();
                                                        } else {
                                                            System.out.println();
                                                            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t     Sorry,Not Matched Your Pin_Code❗");
                                                            System.out.println();
                                                        }
                                                    } else if (n == 6) {
                                                        System.out.println();
                                                        id.Get_ID_N0();
                                                    } else {
                                                        System.out.println();
                                                        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t               Invalid Choose ❌");
                                                        System.out.println();
                                                    }
                                                    System.out.println();
                                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDo You Want Run Again[Y/N]:");
                                                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t--------------------------:");
                                                    NEXT_TIME = SC.next().charAt(0);
                                                }
                                            } else {
                                                System.out.println();
                                                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t    Invalid DATE 🕒. Plz Set Your Date 🕒 ❗");
                                                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t    --------------------------------------");
                                                System.out.println();
                                            }
                                        } else {
                                            System.out.println();
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t  Sorry, Invalid Branch_Code. Plz Try Again ❗");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t  -------------------------------------------");
                                            System.out.println();
                                        }
                                    } else {
                                        System.out.println();
                                        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t               ACCESS DENIED ❌");
                                        System.out.println();
                                    }
                                } while (n == 4);
                                dEscription.FOOTER_PAGE();
                            } else {
                                System.out.println();
                                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t               Invalid Choose ❌");
                                System.out.println();
                            }
                            System.out.println();
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDo You Want Run Again[Y/N]:");
                            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t--------------------------:");
                            NEXT_TIME = SC.next().charAt(0);
                        }
                    } else {
                        System.out.println();
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t    Invalid DATE 🕒. Plz Set Your Date 🕒 ❗");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t    --------------------------------------");
                        System.out.println();
                    }
                } else {
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t  Sorry, Invalid Branch_Code. Plz Try Again ❗");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t  -------------------------------------------");
                    System.out.println();
                }
            } else {
                System.out.println();
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t               ACCESS DENIED ❌");
                System.out.println();
            }
        } while (n == 4);
        dEscription.FOOTER_PAGE();
    }
}

class Searchig_CustomersWithID extends Data_Declares {
    void Get_ID_N0() {
        Scanner GET_ID = new Scanner(System.in);
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tENTER  ID_N0 :");
        id = GET_ID.next();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t------------------");

        if (id.equals("BS69")) {
            System.out.println("S.N          NAME           AGE      SEX              EmailId               CONTACT        ADDRESS       PIN_CODE      ACCOUNT-N0      SAVIG-AMOUNT");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("1     BASANTA CHAUDHARY     19       Male    chaudharybasanta69@gamile.com   9848080877   Koteswore,KTM      1010       8989121354345   💲69140000000.0");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        } else if (id.equals("AB121")) {
            System.out.println("S.N          NAME           AGE      SEX              EmailId               CONTACT          ADDRESS          PIN_CODE      ACCOUNT-N0      SAVIG-AMOUNT");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("2       AURAGHA BITHAA      20       Male    AkaleshBaitha12111@gamile.com   9822280877   Budhanilkantha,KTM      3210       8989121359494      💲121000.0");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        } else if (id.equals("AT131")) {
            System.out.println("S.N          NAME           AGE      SEX              EmailId               CONTACT          ADDRESS          PIN_CODE      ACCOUNT-N0      SAVIG-AMOUNT");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("3      ABDULLA THAKURAI     20       Male    abadulathakurai131@gamile.com   9849080877   Budhanilkantha,KTM      1980       8989121398987     💲6000000.0");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        } else if (id.equals("SP141")) {
            System.out.println("S.N          NAME           AGE      SEX              EmailId               CONTACT        ADDRESS       PIN_CODE      ACCOUNT-N0      SAVIG-AMOUNT");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("4      SABINNA PAUDELL      19      Female    SupupaudelQueen141@gamile.com  9802340877    Chabell,KTM       2090       8989121123456     💲14114000.0");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        } else if (id.equals("SC151")) {
            System.out.println("S.N          NAME           AGE      SEX              EmailId               CONTACT        ADDRESS       PIN_CODE      ACCOUNT-N0      SAVIG-AMOUNT");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("5     SUBASHA CHAUDHARY     19       Male    chaudharsubasha1511@gamile.com   9848554877   Gataghar,KTM      4554       8989121354321      💲114000.0");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        } else if (id.equals("DP161")) {
            System.out.println("S.N          NAME           AGE      SEX              EmailId               CONTACT        ADDRESS       PIN_CODE      ACCOUNT-N0      SAVIG-AMOUNT");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("6       DIPISHA  THAPA      19      Female    chaudharybasanta69@gamile.com  9823080877    Pulchowk,KTM      1330       8989167890985   💲70000000.0");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Not Include ❌");
        }
    }
}

class Deposit_AmountInThe_Bank extends Data_Declares {
    long TotalAmount, money;
    String full_name, ACOUNTn0, DATE;

    void Deposit() {
        Scanner keep = new Scanner(System.in);
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\tENTER YOUR  ACCOUNT NAME:");
        full_name = keep.nextLine();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\tENTER YOUR  ACCOUNT  N0 :");
        ACOUNTn0 = keep.next();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\tENTER YOUR DEPOSITE AMOUNT: 💲");
        TotalAmount = keep.nextLong();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\tENTER    YOUR    Date  🕐  :");
        DATE = keep.next();
        money = TotalAmount;
    }

    void Deposite_AmountDetail() {
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\tS.N  ACCOUNT-NAME             ACCOUNT-N0         DEPOSITED-AMOUNT          DATE");
        System.out.println("\t\t\t\t\t\t\t\t\t\t--------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t1   " + full_name + "        " + ACOUNTn0 + "         " + "💲" + TotalAmount + "           " + DATE);
        System.out.println();
    }

    void Cash_Draw() {
        long Draw_Cash, Money$;
        Scanner amount = new Scanner(System.in);
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\tENTER  Your Transaction Amount: 💲");
        Draw_Cash = amount.nextLong();
        Money$ = Draw_Cash;
        Draw_Cash = money - Draw_Cash;
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\tS.N   ACCOUNT-NAME           ACCOUNT-N0        Transaction-Amount         Total-Amount         DATE");
        System.out.println("\t\t\t\t\t\t\t\t-----------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t1    " + full_name + "      " + ACOUNTn0 + "         " + "💲" + Money$ + "             " + "💲" + Draw_Cash + "        " + DATE);
        System.out.println();
    }
}