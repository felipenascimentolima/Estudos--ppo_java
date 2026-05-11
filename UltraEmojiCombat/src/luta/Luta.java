package luta;
public class Luta {
    public static void main(String[] args) {
        Lutador m [ ]= new Lutador[6];
                
          m[0]=new Lutador("Pretty boy", "França", 31, 1.75f,
                                                68.9f, 11, 2, 1  );
          m[1]=new Lutador("Putscript","Brasil",29, 1.68f,
                                                57.8f, 14, 2,  3);
          m[2]=new Lutador("Snapshadow", "EUA", 35, 1.65f,
                                               80.9f, 12, 2, 1 );
          m[3]= new Lutador("Dead code", "Australia", 28, 1.93f,
                                                81.6f, 13, 0, 2 );
          m[4]=new Lutador("UFOCobol", "Brasil", 37, 1.70f,
                                                119.3f, 5, 4, 3 );
          m[5]=new Lutador("Nerdart", "EUA", 30, 1.81f,
                                                105.7f, 12, 2, 4 );
          
          Disputa uec01=new Disputa();
          uec01.marcarLuta(m[0], m[1]);
          uec01.lutar();
          m[0].status();
          m[5].status();
    }
    
}
