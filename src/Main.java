import java.util.Scanner;
class Main {

    public static String liczba_wybor(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("1 - TAK, 0 - NIE");
        String wybor = scanner.next();
        if (wybor.equals("1")||wybor.equals("0")) {
            return wybor;
        } else {
            System.out.println("Podałeś złe dane!");
            return liczba_wybor();
        }

    }
    public static String menu(){
        Scanner scanner = new Scanner(System.in);
        String switche = scanner.next();
        if (switche.equals("1")||switche.equals("2")){
            return switche;
        } else {
            System.out.println("Podaj prawidłowe dane!");
            return menu();
        }
    }


    public static void glowny_progream(){
        System.out.println("Pomyśl sobie pewną liczbę od 1 do  20");
        System.out.println("Czy twoja liczba jest wieksza lub rowna 10?");

        String retunr=liczba_wybor();

        if (retunr.equals("1")){
            System.out.println("Czy jest parzysta?");
            retunr=liczba_wybor();
            if (retunr.equals("1")){
                System.out.println("Czy liczba jest wieksza od 15?");
                retunr=liczba_wybor();
                if(retunr.equals("1")){
                    System.out.println("Czy twoja liczba dzieli sie przez 18?");
                    retunr=liczba_wybor();
                    if(retunr.equals("1")){
                        System.out.println("Twoja liczba to 18");
                        //System.exit(1);
                    }
                    else if (retunr.equals("0")){
                        System.out.println("Czy twoja liczba dzili sie na 8?");
                        retunr=liczba_wybor();
                        if (retunr.equals("1")){
                            System.out.println("Twoja liczba to 16");
                            // System.exit(1);

                        }
                        else{
                            System.out.println("Twoja liczba to 20");
                            // System.exit(1);
                        }
                    }


                } else {
                    System.out.println("Czy twoja liczba jest podzielna przez 3?");
                    retunr=liczba_wybor();
                    if (retunr.equals("1")){
                        System.out.println("Twoja liczba to 12");
                        //  System.exit(1);

                    }
                    else {
                        System.out.println("Czy twoja liczba jest podzielna przez 7?");
                        retunr=liczba_wybor();
                        if(retunr.equals("1")){
                            System.out.println("Twoja liczba to 14");
                            //   System.exit(1);

                        }else{
                            System.out.println("Czy twoja liczba jest podzielan przez 5?");
                            retunr=liczba_wybor();
                            if(retunr.equals("1")){
                                System.out.println("Twoja liczba to 10");
                                //  System.exit(1);
                            }
                            System.out.println("Twoja liczba to 16");
                            // System.exit(1);
                        }
                    }
                }

            }
            else {
                System.out.println("Czy twoja liczba jest wieksza lub rowna 15");
                retunr=liczba_wybor();
                if(retunr.equals("1")){
                    System.out.println("Czy twoja liczba jest podzielna przez 19?");
                    retunr=liczba_wybor();
                    if (retunr.equals("1")){
                        System.out.println("Twoja liczba to 19");
                        // System.exit(1);
                    }
                    else {
                        System.out.println("Czy twoja liczba jest podzielna przez 3?");
                        retunr=liczba_wybor();
                        if(retunr.equals("1")){
                            System.out.println("Twoja liczba jest rowna 15");
                            //   System.exit(1);
                        } else {
                            System.out.println("Twoja liczba to 17");
                            //  System.exit(1);
                        }
                    }
                } else{
                    System.out.println("Czy w twojej liczbie znajduje sie liczba'3'?");
                    retunr=liczba_wybor();
                    if (retunr.equals("1")){
                        System.out.println("Twoja liczcba to 13!");
                        //  System.exit(1);
                    } else {
                        System.out.println("Twoja liczba to 11");
                        //  System.exit(1);
                    }
                }


            }




        } else{
            System.out.println("Czy twoja liczba jest parzysta?");
            retunr=liczba_wybor();
            if(retunr.equals("1")){
                System.out.println("Czy twoja liczba jest podzielna przez 4?");
                retunr=liczba_wybor();
                if(retunr.equals("1")){
                    System.out.println("Czy twoja liczba jest wiekasza od 5?");
                    retunr=liczba_wybor();
                    if(retunr.equals("1")){
                        System.out.println("Twoja liczba to 8");
                        //  System.exit(1);
                    } else {
                        System.out.println("Twoja liczba to 4");
                    }
                } else {
                    System.out.println("Czy twoja liczba jest podzielna przez 3?");
                    retunr=liczba_wybor();
                    if(retunr.equals("1")){
                        System.out.println("Toja liczba to 6");
                        //  System.exit(1);
                    }else {
                        System.out.println("Twoja liczba to 2");
                        //  System.exit(1);
                    }
                }
            } else {
                System.out.println("Czy twoja liczba jest podzielna przez 3?");
                retunr=liczba_wybor();
                if(retunr.equals("1")){
                    System.out.println("Czy twoja liczba jest liczba pierwsza (podzielna tylko przez 1 oraz przez samą siebie)?");
                    retunr=liczba_wybor();
                    if(retunr.equals("1")){
                        System.out.println("Twoja liczba to 3");
                        System.exit(1);
                    } else {
                        System.out.println("Twoja liczba to 9");
                    }
                } else {
                    System.out.println("Czy towja liczba jest dzielnikiem liczby 14?");
                    retunr=liczba_wybor();
                    if(retunr.equals("1")){
                        System.out.println("Czy twoja liczba jest liczba pierwsza (podzielna tylko przez 1 oraz przez samą siebie)?");
                        retunr=liczba_wybor();
                        if(retunr.equals("1")){
                            System.out.println("Twoja liczba to 7");
                            //  System.exit(1);
                        }else {
                            System.out.println("Twoja liczba to 1");
                            //  System.exit(1);
                        }
                    } else {
                        System.out.println("Twoja liczba to 5");
                        //  System.exit(1);
                    }
                }
            }

        }





    }


    public static void main(String[] args) {
        String switcher="";
        while(true){
            System.out.println(" ---====MENU====--- ");
            System.out.println("|1 - Guess a number|");
            System.out.println(" ------------------ ");
            System.out.println("|     2 - Quit     |");
            System.out.println(" ----==========---- ");
            switcher = menu();

            if(switcher.equals("1")){
                glowny_progream();
            } else {
                System.exit(1);
            }


        }


    }






}