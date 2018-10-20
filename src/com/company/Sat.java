package com.company;

public class Sat {
        private int sati;
    private int minute;
    private int sekunde;
        public Sat(int sati,int minute,int sekunde){Postavi(sati, minute, sekunde);}
        public void Postavi(int sati, int minute,int sekunde){
            this.setSati(sati);
            this.setMinute(minute);
            this.setSekunde(sekunde);
        }
        public void Sljedeci(){
            setSekunde(getSekunde() + 1);
            if(getSekunde() ==60){
                setSekunde(0);
                setMinute(getMinute() + 1);
            }
            if(getMinute() ==60){
                setMinute(0);
                setSati(getSati() + 1);}
            if(getSati() ==24) setSati(0);
        }
        public void Prethodni(){
            setSekunde(getSekunde() - 1);
            if(getSekunde() ==-1){
                setSekunde(59);
                setMinute(getMinute() - 1);}
            if(getMinute() ==-1){
                setMinute(59);
                setSati(getSati() - 1);}
            if(getSati() ==-1) setSati(23);
        }
        public void PomjeriZa(int pomak){
            if(pomak>0)for (int i=0;i<pomak;i++) Sljedeci();
            else for(int i=0;i<-pomak;i++) Prethodni();
        }
        public void Ispisi(){
            System.out.print(sati+":"+minute+":"+sekunde+"\n");
        }


    public static void main(String[] args) {
	// write your code here
        Sat s=new Sat(15,30,45);
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(0,0,0);
        s.Ispisi();
    }

    public int getSati() {
        return sati;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSekunde() {
        return sekunde;
    }

    public void setSekunde(int sekunde) {
        this.sekunde = sekunde;
    }
}
