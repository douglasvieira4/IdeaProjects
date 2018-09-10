public class ExercicioX {
    public static void main(String[] args) {

        //1.	 Imprima	todos	os	números	de	150	a	300.
        //for (int i =150; i <= 300 ; i++){
        //    System.out.println(i);
        //}

        //2.	 Imprima	a	soma	de	1	até	1000.
        //int soma =0;
        //for (int i = 0; i <=1000; i++) {
        //    soma = soma +i ;
        //}
        //System.out.println(soma);

        //3.   Imprima	todos	os	múltiplos	de	3,	entre	1	e	100.
        //for (int i = 1; i < 101 ; i++) {
        //        if(i % 3 ==0 ){
        //            System.out.println(i);
        //        }
        //}

        //4.    Imprima	os	fatoriais	de	1	a	10.
        int fat = 1;
        for(int x = 10; x < 1 ; x-- ) {
            for (int n = 1; n <= x; n++) {
                fat = fat * n;
            }
            System.out.println(fat);
        }

    }
}
