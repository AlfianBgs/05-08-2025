//Object
public class Friend {
     String nama;
     int  usia;
     String cita;
     String hobi;

        public Friend(String n, int u, String c, String h){
            nama = n;
            usia = u;
            cita= c ;
            hobi = h;

        }

       public void print(){
        System.out.println("Nama : "+ nama);
        System.out.println("Usia : "+ usia);
        System.out.println("Cita  : "+cita);
        System.out.println("Hobi : "+hobi);
        System.out.println("");
       }

    
}
