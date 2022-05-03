package com.example.textext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText cad,resu1,resu2,resu3,resu4,resu5,resu6,resu7,resu8,resu9,resu10,uno,dos;
    AutoCompleteTextView spi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cad   = (EditText) findViewById(R.id.et);
        resu1 = (EditText) findViewById(R.id.res1);
        resu2 = (EditText) findViewById(R.id.res2);
        resu3 = (EditText) findViewById(R.id.res3);
        resu4 = (EditText) findViewById(R.id.res4);
        resu5 = (EditText) findViewById(R.id.res5);
        resu6 = (EditText) findViewById(R.id.res6);
        resu7 = (EditText) findViewById(R.id.res7);
        resu8 = (EditText) findViewById(R.id.res8);
        resu9 = (EditText) findViewById(R.id.res9);
        resu10 = (EditText) findViewById(R.id.res10);
        spi=(AutoCompleteTextView) findViewById(R.id.spinner);
        uno=(EditText)findViewById(R.id.uno);
        dos=(EditText)findViewById(R.id.dos);

        String[] tam={"14","16","18","20","22","24","26","28","30","32","34","36","38","40","42","44","46","48","50"};
        ArrayAdapter <String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, tam);
        spi.setAdapter(adapter);


    }

    public void tamanio() {
        String tam=this.spi.getEditableText().toString();

        if(tam.equals("14")){
            camtam(14);
        }
        if(tam.equals("16")){
            camtam(16);
        }
        if(tam.equals("18")){
            camtam(18);
        }
        if(tam.equals("20")){
            camtam(20);
        }
        if(tam.equals("22")){
            camtam(22);
        }
        if(tam.equals("24")){
            camtam(24);
        }
        if(tam.equals("26")){
            camtam(26);
        }
        if(tam.equals("28")){
            camtam(28);
        }
        if(tam.equals("30")){
            camtam(30);
        }
        if(tam.equals("32")){
            camtam(32);
        }
        if(tam.equals("34")){
            camtam(34);
        }
        if(tam.equals("36")){
            camtam(36);
        }
        if(tam.equals("38")){
            camtam(38);
        }
        if(tam.equals("40")){
            camtam(40);
        }
        if(tam.equals("42")){
            camtam(42);
        }
        if(tam.equals("44")){
            camtam(44);
        }
        if(tam.equals("46")){
            camtam(46);
        }
        if(tam.equals("48")){
            camtam(48);
        }
        if(tam.equals("50")){
            camtam(50);
        }
    }

    public void camtam(int t){
        resu1.setTextSize(t);
        resu2.setTextSize(t);
        resu3.setTextSize(t);
        resu4.setTextSize(t);
        resu5.setTextSize(t);
        resu6.setTextSize(t);
        resu7.setTextSize(t);
        resu8.setTextSize(t);
        resu9.setTextSize(t);
        resu10.setTextSize(t);
        uno.setTextSize(t);
        dos.setTextSize(t);
    }

    public void onclick(View view){
        switch (view.getId()){
            case R.id.Checar:
                obtener();
                break;
            case R.id.Siguiente:


                int a,b,c,d,e;
                a=Integer.parseInt(resu2.getText().toString());
                b=Integer.parseInt(resu4.getText().toString());
                c=Integer.parseInt(resu6.getText().toString());
                d=Integer.parseInt(resu8.getText().toString());
                e=Integer.parseInt(resu10.getText().toString());

                int[] A={a,b,c,d,e};
                int[] cao={};
                int aux;
                for (int i = 0; i < A.length - 1; i++) {
                    for (int j = 0; j < A.length - i - 1; j++) {
                        if (A[j + 1] < A[j]) {
                            aux = A[j + 1];
                            A[j + 1] = A[j];
                            A[j] = aux;
                        }
                    }
                }

                //Toast.makeText(getApplicationContext(),"Funciona:"+A[0]+" "+A[1]+" "+A[2]+" "+A[3]+" "+A[4],Toast.LENGTH_SHORT).show();

                Intent dos = new Intent(MainActivity.this,Bueno.class);
                int x=veri1(A[4],dos);

                veri2(A[3],dos,x);

                startActivity(dos);
                break;
            case R.id.Up:
                tamanio();
                break;
        }
    }
    public  void veri2(int a,Intent dos,int x){
        //Intent dos = new Intent(MainActivity.this,Bueno.class);
        if(a==Integer.parseInt(resu2.getText().toString())&&x!=1){
            dos.putExtra("b",resu1.getText().toString());
            return;
        }
        if(a==Integer.parseInt(resu4.getText().toString())&&x!=2){
            dos.putExtra("b",resu3.getText().toString());
            return;
        }
        if(a==Integer.parseInt(resu6.getText().toString())&&x!=3){
            dos.putExtra("b",resu5.getText().toString());
            return;
        }
        if(a==Integer.parseInt(resu8.getText().toString())&&x!=4){
            dos.putExtra("b",resu7.getText().toString());
            return;
        }
        if(a==Integer.parseInt(resu10.getText().toString())&&x!=5){
            dos.putExtra("b",resu9.getText().toString());
            return;
        }
    }
    public int veri1(int a,Intent dos){
        int pru;
        if(a==Integer.parseInt(resu2.getText().toString())){
            dos.putExtra("a",resu1.getText().toString());
            pru=1;
            return pru;
        }
        if(a==Integer.parseInt(resu4.getText().toString())){
            dos.putExtra("a",resu3.getText().toString());
            pru=2;
            return pru;
        }
        if(a==Integer.parseInt(resu6.getText().toString())){
            dos.putExtra("a",resu5.getText().toString());
            pru=3;
            return pru;
        }
        if(a==Integer.parseInt(resu8.getText().toString())){
            dos.putExtra("a",resu7.getText().toString());
            pru=4;
            return pru;
        }
        if(a==Integer.parseInt(resu10.getText().toString())){
            dos.putExtra("a",resu9.getText().toString());
            pru=5;
            return pru;
        }
        return 0;
    }

    public void obtener() {
        String ca=cad.getText().toString();
        String cade=ca.toLowerCase(Locale.ROOT);
        System.out.println(cade);
        //resu1.setText(cade);
        //Toast.makeText(getApplicationContext(),"Datos: "+cade,Toast.LENGTH_SHORT).show();
        //Intent dos = new Intent(MainActivity.this,Bueno.class);
        //startActivity(dos);

        int num=numero(cade);
        String pal=llenar(num,cade);
        String ap= String.valueOf( aptitud(cade,pal));
        resu1.setText(pal);
        resu2.setText(ap);
        pal=llenar(num,cade);
        ap= String.valueOf( aptitud(cade,pal));
        resu3.setText(pal);
        resu4.setText(ap);
        pal=llenar(num,cade);
        ap= String.valueOf( aptitud(cade,pal));
        resu5.setText(pal);
        resu6.setText(ap);
        pal=llenar(num,cade);
        ap= String.valueOf( aptitud(cade,pal));
        resu7.setText(pal);
        resu8.setText(ap);
        pal=llenar(num,cade);
        ap= String.valueOf( aptitud(cade,pal));
        resu9.setText(pal);
        resu10.setText(ap);
    }

    public int numero(String ca){
        int can=-1;
        for(int i=0; i<=ca.length();i++){
            can++;
        }
        String cans= String.valueOf(can);
        resu2.setText(cans);
        return can;
    }

    public String llenar(int x,String g){

        String cans="";
        Random r=new Random();
        for(int i=0; i<x;i++){
            int a=r.nextInt(122-32)+32;
            char c= (char) a;
            cans+=c;
        }
        /*String f= String.valueOf(x);
        resu3.setText(cans);
        /*String prue=String.valueOf(cans.charAt(2));
        resu4.setText(prue);
        int res=0;
        for (int i=0;i<g.length();i++){
            for(int j=0;j<g.length();j++){
                System.out.println("cadena 1: "+String.valueOf(cans.charAt(i)+" en ["+i+"]"));
                System.out.println("cadena 2: "+String.valueOf(g.charAt(j)+" en ["+j+"]"));

                if(cans.charAt(i)==g.charAt(j)){
                    res++;
                }
            }
            if(cans.charAt(i)==g.charAt(i)){
                res++;
            }
        }*/
        String temp=cans;
        cans=temp.toLowerCase(Locale.ROOT);
        return cans;
    }

    public int aptitud(String g,String cans){
        int res=0;
        for (int i=0;i<g.length();i++){
            for(int j=0;j<g.length();j++){
                System.out.println("cadena 1: "+String.valueOf(cans.charAt(i)+" en ["+i+"]"));
                System.out.println("cadena 2: "+String.valueOf(g.charAt(j)+" en ["+j+"]"));

                if(cans.charAt(i)==g.charAt(j)){
                    res++;
                }
            }
            if(cans.charAt(i)==g.charAt(i)){
                res++;
            }
        }
        return res;
    }

}