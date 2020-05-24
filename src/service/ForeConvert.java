package service;

public class ForeConvert {
        public static void main(String[] args) {
                int intVal = 9 ;
                long longVal = 19999 ;
                intVal = ( int ) longVal ;
                System.out.println( intVal);

                float floatVal = 11.32f ;
                double doubleVal = 3344556.789 ;
                floatVal = ( float ) doubleVal ;
                System.out.println( floatVal );

                int a = 65 + 10 ;
                char b = ( char ) a ;
                System.out.println( b );


        }
}