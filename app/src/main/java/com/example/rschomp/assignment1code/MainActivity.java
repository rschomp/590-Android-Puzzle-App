package com.example.rschomp.assignment1code;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.nfc.Tag;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
    Button aClicker, bClicker, cClicker, dClicker, eClicker, fClicker, gClicker,
            hClicker, iClicker, jClicker;
    String colorOfButton;
    String b0Color, b1Color, b2Color, b3Color, b4Color, b5Color, b6Color, b7Color,
            b8Color, b9Color, b10Color, b11Color, b12Color, b13Color, b14Color, b15Color;
    TextView mc, seq;
    Boolean aClicked, bClicked, cClicked, dClicked, eClicked, fClicked, gClicked,
            hClicked, iClicked, jClicked, restartClicked;
    Button rest, aut;
    int count;
    String sequencePhrase = "Sequence: ";
    String moveCountPhrase = "Move Count: ";

    Button clickedList[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mc = (TextView)findViewById(R.id.moveCount);
        seq = (TextView)findViewById(R.id.sequence);
        rest = (Button)findViewById(R.id.restart);
        aut = (Button)findViewById(R.id.auto);
        buttonInfo();
        clickedList = new Button[10];

        //for testing combinations
        /*
        b0 = (Button)findViewById(R.id.button0);
        b0Color = "cyan";
        b0.setBackgroundColor(Color.CYAN);
        b0.invalidate();

        b1 = (Button)findViewById(R.id.button1);
        b1Color = "cyan";
        b1.setBackgroundColor(Color.CYAN);
        b1.invalidate();

        b2 = (Button)findViewById(R.id.button2);
        b2Color = "cyan";
        b2.setBackgroundColor(Color.CYAN);
        b2.invalidate();

        b3 = (Button)findViewById(R.id.button3);
        b3Color = "green";
        b3.setBackgroundColor(Color.GREEN);
        b3.invalidate();

        b4 = (Button)findViewById(R.id.button4);
        b4Color = "green";
        b4.setBackgroundColor(Color.GREEN);
        b4.invalidate();

        b5 = (Button)findViewById(R.id.button5);
        b5Color = "green";
        b5.setBackgroundColor(Color.GREEN);
        b5.invalidate();

        b6 = (Button)findViewById(R.id.button6);
        b6Color = "green";
        b6.setBackgroundColor(Color.GREEN);
        b6.invalidate();

        b7 = (Button)findViewById(R.id.button7);
        b7Color = "green";
        b7.setBackgroundColor(Color.GREEN);
        b7.invalidate();

        b8 = (Button)findViewById(R.id.button8);
        b8Color = "green";
        b8.setBackgroundColor(Color.GREEN);
        b8.invalidate();

        b9 = (Button)findViewById(R.id.button9);
        b9Color = "green";
        b9.setBackgroundColor(Color.GREEN);
        b9.invalidate();

        b10 = (Button)findViewById(R.id.button10);
        b10Color = "green";
        b10.setBackgroundColor(Color.GREEN);
        b10.invalidate();

        b11 = (Button)findViewById(R.id.button11);
        b11Color = "green";
        b11.setBackgroundColor(Color.GREEN);
        b11.invalidate();

        b12 = (Button)findViewById(R.id.button12);
        b12Color = "green";
        b12.setBackgroundColor(Color.GREEN);
        b12.invalidate();

        b13 = (Button)findViewById(R.id.button13);
        b13Color = "green";
        b13.setBackgroundColor(Color.GREEN);
        b13.invalidate();

        b14 = (Button)findViewById(R.id.button14);
        b14Color = "green";
        b14.setBackgroundColor(Color.GREEN);
        b14.invalidate();

        b15 = (Button)findViewById(R.id.button15);
        b15Color = "green";
        b15.setBackgroundColor(Color.GREEN);
        b15.invalidate();

        */

        aClicker = (Button) findViewById(R.id.buttonA);
        clickedList[0] = aClicker;
        bClicker = (Button) findViewById(R.id.buttonB);
        clickedList[1] = bClicker;
        cClicker = (Button) findViewById(R.id.buttonC);
        clickedList[2] = cClicker;
        dClicker = (Button) findViewById(R.id.buttonD);
        clickedList[3] = dClicker;
        eClicker = (Button) findViewById(R.id.buttonE);
        clickedList[4] = eClicker;
        fClicker = (Button) findViewById(R.id.buttonF);
        clickedList[5] = fClicker;
        gClicker = (Button) findViewById(R.id.buttonG);
        clickedList[6] = gClicker;
        hClicker = (Button) findViewById(R.id.buttonH);
        clickedList[7] = hClicker;
        iClicker = (Button) findViewById(R.id.buttonI);
        clickedList[8] = iClicker;
        jClicker = (Button) findViewById(R.id.buttonJ);
        clickedList[9] = jClicker;

        zeroButtonClicked();
    }


    void buttonInfo(){
        b0 = (Button)findViewById(R.id.button0);
        b0.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b0Color = "cyan";
        }
        else {
            b0Color = "green";
        }
        b0.invalidate();

        b1 = (Button)findViewById(R.id.button1);
        b1.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b1Color = "cyan";
        }
        else {
            b1Color = "green";
        }
        b1.invalidate();

        b2 = (Button)findViewById(R.id.button2);
        b2.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b2Color = "cyan";
        }
        else {
            b2Color = "green";
        }
        b2.invalidate();

        b3 = (Button)findViewById(R.id.button3);
        b3.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b3Color = "cyan";
        }
        else {
            b3Color = "green";
        }
        b3.invalidate();

        b4 = (Button)findViewById(R.id.button4);
        b4.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b4Color = "cyan";
        }
        else {
            b4Color = "green";
        }
        b4.invalidate();

        b5 = (Button)findViewById(R.id.button5);
        b5.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b5Color = "cyan";
        }
        else {
            b5Color = "green";
        }
        b5.invalidate();

        b6 = (Button)findViewById(R.id.button6);
        b6.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b6Color = "cyan";
        }
        else {
            b6Color = "green";
        }
        b6.invalidate();

        b7 = (Button)findViewById(R.id.button7);
        b7.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b7Color = "cyan";
        }
        else {
            b7Color = "green";
        }
        b7.invalidate();

        b8 = (Button)findViewById(R.id.button8);
        b8.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b8Color = "cyan";
        }
        else {
            b8Color = "green";
        }
        b8.invalidate();

        b9 = (Button)findViewById(R.id.button9);
        b9.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b9Color = "cyan";
        }
        else {
            b9Color = "green";
        }
        b9.invalidate();

        b10 = (Button)findViewById(R.id.button10);
        b10.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b10Color = "cyan";
        }
        else {
            b10Color = "green";
        }
        b10.invalidate();

        b11 = (Button)findViewById(R.id.button11);
        b11.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b11Color = "cyan";
        }
        else {
            b11Color = "green";
        }
        b11.invalidate();

        b12 = (Button)findViewById(R.id.button12);
        b12.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b12Color = "cyan";
        }
        else {
            b12Color = "green";
        }
        b12.invalidate();

        b13 = (Button)findViewById(R.id.button13);
        b13.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b13Color = "cyan";
        }
        else {
            b13Color = "green";
        }
        b13.invalidate();

        b14 = (Button)findViewById(R.id.button14);
        b14.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b14Color = "cyan";
        }
        else {
            b14Color = "green";
        }
        b14.invalidate();

        b15 = (Button)findViewById(R.id.button15);
        b15.setBackgroundColor(randomColor());
        if (colorOfButton == "cyan"){
            b15Color = "cyan";
        }
        else {
            b15Color = "green";
        }
        b15.invalidate();

    }

    int randomColor(){
        double randomNumber = Math.random();
        if(randomNumber > .5){
            colorOfButton = "cyan";
            return Color.CYAN;
        }
        else {
            colorOfButton = "green";
            return Color.GREEN;
        }
    }


    public boolean boardFull(){
        if (b0Color == "cyan" && b1Color == "cyan" && b2Color == "cyan" && b3Color == "cyan"
                && b4Color == "cyan" && b5Color == "cyan" && b6Color == "cyan"
                && b7Color == "cyan" && b8Color == "cyan" && b9Color == "cyan"
                && b10Color == "cyan" && b11Color == "cyan" && b12Color == "cyan"
                && b13Color == "cyan" && b14Color == "cyan" && b15Color == "cyan"){


            Toast.makeText(MainActivity.this, "CONGRATS! YOU WON!",
                    Toast.LENGTH_SHORT).show();
            return true;


        }
        if (b0Color == "green" && b1Color == "green" && b2Color == "green" && b3Color == "green"
                && b4Color == "green" && b5Color == "green" && b6Color == "green"
                && b7Color == "green" && b8Color == "green" && b9Color == "green"
                && b10Color == "green" && b11Color == "green" && b12Color == "green"
                && b13Color == "green" && b14Color == "green" && b15Color == "green"){


            Toast.makeText(MainActivity.this, "CONGRATS! YOU WON!",
                    Toast.LENGTH_SHORT).show();
            return true;

        }
        return false;
    }

    void clickedA(View v){

        aClicked = Boolean.TRUE;
        count++;
        whatClicked();

        if (b0Color == "cyan"){
            b0.setBackgroundColor(Color.GREEN);
            b0Color = "green";
        }
        else {
            b0.setBackgroundColor(Color.CYAN);
            b0Color = "cyan";
        }

        if (b1Color == "cyan"){
            b1.setBackgroundColor(Color.GREEN);
            b1Color = "green";
        }
        else {
            b1.setBackgroundColor(Color.CYAN);
            b1Color = "cyan";
        }

        if (b2Color == "cyan"){
            b2.setBackgroundColor(Color.GREEN);
            b2Color = "green";
        }
        else {
            b2.setBackgroundColor(Color.CYAN);
            b2Color = "cyan";
        }

        boardFull();
    }

    void clickedB(View v){

        bClicked = Boolean.TRUE;
        count++;
        whatClicked();

        if (b3Color == "cyan"){
            b3.setBackgroundColor(Color.GREEN);
            b3Color = "green";
        }
        else {
            b3.setBackgroundColor(Color.CYAN);
            b3Color = "cyan";
        }

        if (b7Color == "cyan"){
            b7.setBackgroundColor(Color.GREEN);
            b7Color = "green";
        }
        else {
            b7.setBackgroundColor(Color.CYAN);
            b7Color = "cyan";
        }

        if (b9Color == "cyan"){
            b9.setBackgroundColor(Color.GREEN);
            b9Color = "green";
        }
        else {
            b9.setBackgroundColor(Color.CYAN);
            b9Color = "cyan";
        }

        if (b11Color == "cyan"){
            b11.setBackgroundColor(Color.GREEN);
            b11Color = "green";
        }
        else {
            b11.setBackgroundColor(Color.CYAN);
            b11Color = "cyan";
        }

        boardFull();
    }

    void clickedC(View v){

        cClicked = Boolean.TRUE;
        count++;
        whatClicked();

        if (b4Color == "cyan"){
            b4.setBackgroundColor(Color.GREEN);
            b4Color = "green";
        }
        else {
            b4.setBackgroundColor(Color.CYAN);
            b4Color = "cyan";
        }

        if (b10Color == "cyan"){
            b10.setBackgroundColor(Color.GREEN);
            b10Color = "green";
        }
        else {
            b10.setBackgroundColor(Color.CYAN);
            b10Color = "cyan";
        }

        if (b14Color == "cyan"){
            b14.setBackgroundColor(Color.GREEN);
            b14Color = "green";
        }
        else {
            b14.setBackgroundColor(Color.CYAN);
            b14Color = "cyan";
        }

        if (b15Color == "cyan"){
            b15.setBackgroundColor(Color.GREEN);
            b15Color = "green";
        }
        else {
            b15.setBackgroundColor(Color.CYAN);
            b15Color = "cyan";
        }

        boardFull();
    }

    void clickedD(View v){

        dClicked = Boolean.TRUE;
        count++;
        whatClicked();

        if (b0Color == "cyan"){
            b0.setBackgroundColor(Color.GREEN);
            b0Color = "green";
        }
        else {
            b0.setBackgroundColor(Color.CYAN);
            b0Color = "cyan";
        }

        if (b4Color == "cyan"){
            b4.setBackgroundColor(Color.GREEN);
            b4Color = "green";
        }
        else {
            b4.setBackgroundColor(Color.CYAN);
            b4Color = "cyan";
        }

        if (b5Color == "cyan"){
            b5.setBackgroundColor(Color.GREEN);
            b5Color = "green";
        }
        else {
            b5.setBackgroundColor(Color.CYAN);
            b5Color = "cyan";
        }

        if (b6Color == "cyan"){
            b6.setBackgroundColor(Color.GREEN);
            b6Color = "green";
        }
        else {
            b6.setBackgroundColor(Color.CYAN);
            b6Color = "cyan";
        }

        if (b7Color == "cyan"){
            b7.setBackgroundColor(Color.GREEN);
            b7Color = "green";
        }
        else {
            b7.setBackgroundColor(Color.CYAN);
            b7Color = "cyan";
        }

        boardFull();
    }

    void clickedE(View v){

        eClicked = Boolean.TRUE;
        count++;
        whatClicked();

        if (b12Color == "cyan"){
            b12.setBackgroundColor(Color.GREEN);
            b12Color = "green";
        }
        else {
            b12.setBackgroundColor(Color.CYAN);
            b12Color = "cyan";
        }

        if (b10Color == "cyan"){
            b10.setBackgroundColor(Color.GREEN);
            b10Color = "green";
        }
        else {
            b10.setBackgroundColor(Color.CYAN);
            b10Color = "cyan";
        }

        if (b8Color == "cyan"){
            b8.setBackgroundColor(Color.GREEN);
            b8Color = "green";
        }
        else {
            b8.setBackgroundColor(Color.CYAN);
            b8Color = "cyan";
        }

        if (b6Color == "cyan"){
            b6.setBackgroundColor(Color.GREEN);
            b6Color = "green";
        }
        else {
            b6.setBackgroundColor(Color.CYAN);
            b6Color = "cyan";
        }

        if (b7Color == "cyan"){
            b7.setBackgroundColor(Color.GREEN);
            b7Color = "green";
        }
        else {
            b7.setBackgroundColor(Color.CYAN);
            b7Color = "cyan";
        }

        boardFull();
    }

    void clickedF(View v){

        fClicked = Boolean.TRUE;
        count++;
        whatClicked();

        if (b0Color == "cyan"){
            b0.setBackgroundColor(Color.GREEN);
            b0Color = "green";
        }
        else {
            b0.setBackgroundColor(Color.CYAN);
            b0Color = "cyan";
        }

        if (b2Color == "cyan"){
            b2.setBackgroundColor(Color.GREEN);
            b2Color = "green";
        }
        else {
            b2.setBackgroundColor(Color.CYAN);
            b2Color = "cyan";
        }

        if (b15Color == "cyan"){
            b15.setBackgroundColor(Color.GREEN);
            b15Color = "green";
        }
        else {
            b15.setBackgroundColor(Color.CYAN);
            b15Color = "cyan";
        }

        if (b14Color == "cyan"){
            b14.setBackgroundColor(Color.GREEN);
            b14Color = "green";
        }
        else {
            b14.setBackgroundColor(Color.CYAN);
            b14Color = "cyan";
        }

        boardFull();
    }

    void clickedG(View v){

        gClicked = Boolean.TRUE;
        count++;
        whatClicked();

        if (b3Color == "cyan"){
            b3.setBackgroundColor(Color.GREEN);
            b3Color = "green";
        }
        else {
            b3.setBackgroundColor(Color.CYAN);
            b3Color = "cyan";
        }

        if (b15Color == "cyan"){
            b15.setBackgroundColor(Color.GREEN);
            b15Color = "green";
        }
        else {
            b15.setBackgroundColor(Color.CYAN);
            b15Color = "cyan";
        }

        if (b14Color == "cyan"){
            b14.setBackgroundColor(Color.GREEN);
            b14Color = "green";
        }
        else {
            b14.setBackgroundColor(Color.CYAN);
            b14Color = "cyan";
        }

        boardFull();
    }

    void clickedH(View v){

        hClicked = Boolean.TRUE;
        count++;
        whatClicked();

        if (b4Color == "cyan"){
            b4.setBackgroundColor(Color.GREEN);
            b4Color = "green";
        }
        else {
            b4.setBackgroundColor(Color.CYAN);
            b4Color = "cyan";
        }

        if (b5Color == "cyan"){
            b5.setBackgroundColor(Color.GREEN);
            b5Color = "green";
        }
        else {
            b5.setBackgroundColor(Color.CYAN);
            b5Color = "cyan";
        }

        if (b7Color == "cyan"){
            b7.setBackgroundColor(Color.GREEN);
            b7Color = "green";
        }
        else {
            b7.setBackgroundColor(Color.CYAN);
            b7Color = "cyan";
        }

        if (b15Color == "cyan"){
            b15.setBackgroundColor(Color.GREEN);
            b15Color = "green";
        }
        else {
            b15.setBackgroundColor(Color.CYAN);
            b15Color = "cyan";
        }

        if (b14Color == "cyan"){
            b14.setBackgroundColor(Color.GREEN);
            b14Color = "green";
        }
        else {
            b14.setBackgroundColor(Color.CYAN);
            b14Color = "cyan";
        }

        boardFull();
    }

    void clickedI(View v){

        iClicked = Boolean.TRUE;
        count++;
        whatClicked();

        if (b3Color == "cyan"){
            b3.setBackgroundColor(Color.GREEN);
            b3Color = "green";
        }
        else {
            b3.setBackgroundColor(Color.CYAN);
            b3Color = "cyan";
        }

        if (b1Color == "cyan"){
            b1.setBackgroundColor(Color.GREEN);
            b1Color = "green";
        }
        else {
            b1.setBackgroundColor(Color.CYAN);
            b1Color = "cyan";
        }

        if (b2Color == "cyan"){
            b2.setBackgroundColor(Color.GREEN);
            b2Color = "green";
        }
        else {
            b2.setBackgroundColor(Color.CYAN);
            b2Color = "cyan";
        }

        if (b4Color == "cyan"){
            b4.setBackgroundColor(Color.GREEN);
            b4Color = "green";
        }
        else {
            b4.setBackgroundColor(Color.CYAN);
            b4Color = "cyan";
        }

        if (b5Color == "cyan"){
            b5.setBackgroundColor(Color.GREEN);
            b5Color = "green";
        }
        else {
            b5.setBackgroundColor(Color.CYAN);
            b5Color = "cyan";
        }

        boardFull();
    }

    void clickedJ(View v){

        jClicked = Boolean.TRUE;
        count++;
        whatClicked();

        if (b4Color == "cyan"){
            b4.setBackgroundColor(Color.GREEN);
            b4Color = "green";
        }
        else {
            b4.setBackgroundColor(Color.CYAN);
            b4Color = "cyan";
        }

        if (b3Color == "cyan"){
            b3.setBackgroundColor(Color.GREEN);
            b3Color = "green";
        }
        else {
            b3.setBackgroundColor(Color.CYAN);
            b3Color = "cyan";
        }

        if (b5Color == "cyan"){
            b5.setBackgroundColor(Color.GREEN);
            b5Color = "green";
        }
        else {
            b5.setBackgroundColor(Color.CYAN);
            b5Color = "cyan";
        }

        if (b9Color == "cyan"){
            b9.setBackgroundColor(Color.GREEN);
            b9Color = "green";
        }
        else {
            b9.setBackgroundColor(Color.CYAN);
            b9Color = "cyan";
        }

        if (b13Color == "cyan"){
            b13.setBackgroundColor(Color.GREEN);
            b13Color = "green";
        }
        else {
            b13.setBackgroundColor(Color.CYAN);
            b13Color = "cyan";
        }

        boardFull();
    }

    void clickedRestart(View v){
        restartClicked = Boolean.TRUE;
        whatClicked();
    }


    public String getTheTag(Button b){
        String tag = b.getTag().toString();
        return tag;
    }

    public void autoSolve(View v){
        boardFull();
        oneButtonClicked(v);
        if(boardFull()){
            return;
        }
        twoButtonClicked(v);
        if(boardFull()){
            return;
        }

        threeButtonClicked(v);
        if(boardFull()){
            return;
        }
        fourButtonClicked(v);
        if(boardFull()){
            return;
        }
        fiveButtonClicked(v);
        if(boardFull()){
            return;
        }
        sixButtonClicked(v);
        if(boardFull()){
            return;
        }
        sevenButtonClicked(v);
        if(boardFull()){
            return;
        }
        eightButtonClicked(v);
        if(boardFull()){
            return;
        }
        nineButtonClicked(v);
        if(boardFull()){
            return;
        }
        tenButtonClicked(v);
        if(boardFull()){
            return;
        }

        seq.setText("Sequence: ");
        mc.setText("Move Count: ");
        Toast.makeText(MainActivity.this, "NO SOLUTION",
                Toast.LENGTH_SHORT).show();
    }

    public void zeroButtonClicked(){
            if (boardFull()) {
                String fullSeqPhrase = "Sequence: ";
                seq.setText(fullSeqPhrase);
                mc.setText("Move Count: ");
                return;
            }
        }

    public void oneButtonClicked(View v){
        for (int m = 0; m<clickedList.length; m++) {
            Button butM = clickedList[m];
            butM.performClick();

            if (boardFull()) {
                String fullSeqPhrase = "Sequence: " + getTheTag(butM);
                seq.setText(fullSeqPhrase);
                mc.setText("Move Count: 1");
                return;
            } else {
                butM.performClick();
            }
        }
    }

    public void twoButtonClicked(View v){
        for (int m = 0; m<clickedList.length; m++) {
            Button butM = clickedList[m];
            butM.performClick();
            for (int n = m; n<clickedList.length; n++) {
                Button butN = clickedList[n];
                butN.performClick();

                if (boardFull()) {
                    String fullSeqPhrase = "Sequence: " + getTheTag(butM) + getTheTag(butN);
                    String fullMCPhrase = "Move Count: 2";
                    seq.setText(fullSeqPhrase);
                    mc.setText(fullMCPhrase);
                    return;
                } else {
                    butN.performClick();
                }
            }
            butM.performClick();
        }
    }

    public void threeButtonClicked(View v){
        for (int m = 0; m<clickedList.length; m++) {
            Button butM = clickedList[m];
            butM.performClick();
            for (int n = m; n<clickedList.length; n++) {
                Button butN = clickedList[n];
                butN.performClick();
                for (int o = n; o < clickedList.length; o++) {
                    Button butO = clickedList[o];
                    butO.performClick();

                    if (boardFull()) {
                        String fullSeqPhrase = "Sequence: " + getTheTag(butM) + getTheTag(butN) + getTheTag(butO);
                        String fullMCPhrase = "Move Count: 3";
                        seq.setText(fullSeqPhrase);
                        mc.setText(fullMCPhrase);
                        return;
                    } else {
                        butO.performClick();
                    }
                }
                butN.performClick();
            }
            butM.performClick();
        }
    }

    public void fourButtonClicked(View v){
        for (int m = 0; m<clickedList.length; m++) {
            Button butM = clickedList[m];
            butM.performClick();
            for (int n = m; n<clickedList.length; n++) {
                Button butN = clickedList[n];
                butN.performClick();
                for (int o = n; o < clickedList.length; o++) {
                    Button butO = clickedList[o];
                    butO.performClick();
                    for (int p = o; p < clickedList.length; p++) {
                        Button butP = clickedList[p];
                        butP.performClick();

                        if (boardFull()) {
                            String fullSeqPhrase = "Sequence: " + getTheTag(butM) + getTheTag(butN) + getTheTag(butO)
                                    + getTheTag(butP);
                            String fullMCPhrase = "Move Count: 4";
                            seq.setText(fullSeqPhrase);
                            mc.setText(fullMCPhrase);
                            return;
                        } else {
                            butP.performClick();
                        }
                    }
                    butO.performClick();
                }
                butN.performClick();
            }
            butM.performClick();
        }
    }

    public void fiveButtonClicked(View v){
        for (int m = 0; m<clickedList.length; m++) {
            Button butM = clickedList[m];
            butM.performClick();
            for (int n = m; n<clickedList.length; n++) {
                Button butN = clickedList[n];
                butN.performClick();
                for (int o = n; o < clickedList.length; o++) {
                    Button butO = clickedList[o];
                    butO.performClick();
                    for (int p = o; p < clickedList.length; p++) {
                        Button butP = clickedList[p];
                        butP.performClick();
                        for (int q = p; q < clickedList.length; q++) {
                            Button butQ = clickedList[q];
                            butQ.performClick();

                            if (boardFull()) {
                                String fullSeqPhrase = "Sequence: " + getTheTag(butM) + getTheTag(butN) + getTheTag(butO)
                                        + getTheTag(butP) + getTheTag(butQ);
                                String fullMCPhrase = "Move Count: 5";
                                seq.setText(fullSeqPhrase);
                                mc.setText(fullMCPhrase);
                                return;
                            } else {
                                butQ.performClick();
                            }
                        }
                        butP.performClick();
                    }
                    butO.performClick();
                }
                butN.performClick();
            }
            butM.performClick();
        }
    }


    public void sixButtonClicked(View v){
        for (int m = 0; m<clickedList.length; m++) {
            Button butM = clickedList[m];
            butM.performClick();
            for (int n = m; n<clickedList.length; n++) {
                Button butN = clickedList[n];
                butN.performClick();
                for (int o = n; o < clickedList.length; o++) {
                    Button butO = clickedList[o];
                    butO.performClick();
                    for (int p = o; p < clickedList.length; p++) {
                        Button butP = clickedList[p];
                        butP.performClick();
                        for (int q = p; q < clickedList.length; q++) {
                            Button butQ = clickedList[q];
                            butQ.performClick();
                            for (int r = q; r < clickedList.length; r++) {
                                Button butR = clickedList[r];
                                butR.performClick();

                                if (boardFull()) {
                                    String fullSeqPhrase = "Sequence: " + getTheTag(butM) + getTheTag(butN)
                                            + getTheTag(butO) + getTheTag(butP) + getTheTag(butQ) + getTheTag(butR);
                                    String fullMCPhrase = "Move Count: 6";
                                    seq.setText(fullSeqPhrase);
                                    mc.setText(fullMCPhrase);
                                    return;
                                } else {
                                    butR.performClick();
                                }
                            }
                            butQ.performClick();
                        }
                        butP.performClick();
                    }
                    butO.performClick();
                }
                butN.performClick();
            }
            butM.performClick();
        }
    }

    public void sevenButtonClicked(View v){
        for (int m = 0; m<clickedList.length; m++) {
            Button butM = clickedList[m];
            butM.performClick();
            for (int n = m; n<clickedList.length; n++) {
                Button butN = clickedList[n];
                butN.performClick();
                for (int o = n; o < clickedList.length; o++) {
                    Button butO = clickedList[o];
                    butO.performClick();
                    for (int p = o; p < clickedList.length; p++) {
                        Button butP = clickedList[p];
                        butP.performClick();
                        for (int q = p; q < clickedList.length; q++) {
                            Button butQ = clickedList[q];
                            butQ.performClick();
                            for (int r = q; r < clickedList.length; r++) {
                                Button butR = clickedList[r];
                                butR.performClick();
                                for (int s = r; s < clickedList.length; s++) {
                                    Button butS = clickedList[s];
                                    butS.performClick();

                                    if (boardFull()) {
                                        String fullSeqPhrase = "Sequence: " + getTheTag(butM) + getTheTag(butN)
                                                + getTheTag(butO) + getTheTag(butP) + getTheTag(butQ) + getTheTag(butR)
                                                + getTheTag(butS);
                                        String fullMCPhrase = "Move Count: 7";
                                        seq.setText(fullSeqPhrase);
                                        mc.setText(fullMCPhrase);
                                        return;
                                    } else {
                                        butS.performClick();
                                    }
                                }
                                butR.performClick();
                            }
                            butQ.performClick();
                        }
                        butP.performClick();
                    }
                    butO.performClick();
                }
                butN.performClick();
            }
            butM.performClick();
        }
    }

    public void eightButtonClicked(View v){
        for (int m = 0; m<clickedList.length; m++) {
            Button butM = clickedList[m];
            butM.performClick();
            for (int n = m; n<clickedList.length; n++) {
                Button butN = clickedList[n];
                butN.performClick();
                for (int o = n; o < clickedList.length; o++) {
                    Button butO = clickedList[o];
                    butO.performClick();
                    for (int p = o; p < clickedList.length; p++) {
                        Button butP = clickedList[p];
                        butP.performClick();
                        for (int q = p; q < clickedList.length; q++) {
                            Button butQ = clickedList[q];
                            butQ.performClick();
                            for (int r = q; r < clickedList.length; r++) {
                                Button butR = clickedList[r];
                                butR.performClick();
                                for (int s = r; s < clickedList.length; s++) {
                                    Button butS = clickedList[s];
                                    butS.performClick();
                                    for (int t = s; t < clickedList.length; t++) {
                                        Button butT = clickedList[t];
                                        butT.performClick();

                                        if (boardFull()) {
                                            String fullSeqPhrase = "Sequence: " + getTheTag(butM) + getTheTag(butN)
                                                    + getTheTag(butO) + getTheTag(butP) + getTheTag(butQ) + getTheTag(butR)
                                                    + getTheTag(butS) + getTheTag(butT);
                                            String fullMCPhrase = "Move Count: 8";
                                            seq.setText(fullSeqPhrase);
                                            mc.setText(fullMCPhrase);
                                            return;
                                        } else {
                                            butT.performClick();
                                        }
                                    }
                                    butS.performClick();
                                }
                                butR.performClick();
                            }
                            butQ.performClick();
                        }
                        butP.performClick();
                    }
                    butO.performClick();
                }
                butN.performClick();
            }
            butM.performClick();
        }
    }

    public void nineButtonClicked(View v){
        for (int m = 0; m<clickedList.length; m++) {
            Button butM = clickedList[m];
            butM.performClick();
            for (int n = m; n<clickedList.length; n++) {
                Button butN = clickedList[n];
                butN.performClick();
                for (int o = n; o < clickedList.length; o++) {
                    Button butO = clickedList[o];
                    butO.performClick();
                    for (int p = o; p < clickedList.length; p++) {
                        Button butP = clickedList[p];
                        butP.performClick();
                        for (int q = p; q < clickedList.length; q++) {
                            Button butQ = clickedList[q];
                            butQ.performClick();
                            for (int r = q; r < clickedList.length; r++) {
                                Button butR = clickedList[r];
                                butR.performClick();
                                for (int s = r; s < clickedList.length; s++) {
                                    Button butS = clickedList[s];
                                    butS.performClick();
                                    for (int t = s; t < clickedList.length; t++) {
                                        Button butT = clickedList[t];
                                        butT.performClick();
                                        for (int u = t; u < clickedList.length; u++) {
                                            Button butU = clickedList[u];
                                            butU.performClick();

                                            if (boardFull()) {
                                                String fullSeqPhrase = "Sequence: " + getTheTag(butM) + getTheTag(butN)
                                                        + getTheTag(butO) + getTheTag(butP) + getTheTag(butQ) + getTheTag(butR)
                                                        + getTheTag(butS) + getTheTag(butT) + getTheTag(butU);
                                                String fullMCPhrase = "Move Count: 9";
                                                seq.setText(fullSeqPhrase);
                                                mc.setText(fullMCPhrase);
                                                return;
                                            } else {
                                                butU.performClick();
                                            }
                                        }
                                        butT.performClick();
                                    }
                                    butS.performClick();
                                }
                                butR.performClick();
                            }
                            butQ.performClick();
                        }
                        butP.performClick();
                    }
                    butO.performClick();
                }
                butN.performClick();
            }
            butM.performClick();
        }
    }

    public void tenButtonClicked(View v) {
        for (int m = 0; m<clickedList.length; m++) {
            Button butM = clickedList[m];
            butM.performClick();
            for (int n = m; n<clickedList.length; n++) {
                Button butN = clickedList[n];
                butN.performClick();
                for (int o = n; o < clickedList.length; o++) {
                    Button butO = clickedList[o];
                    butO.performClick();
                    for (int p = o; p < clickedList.length; p++) {
                        Button butP = clickedList[p];
                        butP.performClick();
                        for (int q = p; q < clickedList.length; q++) {
                            Button butQ = clickedList[q];
                            butQ.performClick();
                            for (int r = q; r < clickedList.length; r++) {
                                Button butR = clickedList[r];
                                butR.performClick();
                                for (int s = r; s < clickedList.length; s++) {
                                    Button butS = clickedList[s];
                                    butS.performClick();
                                    for (int t = s; t < clickedList.length; t++) {
                                        Button butT = clickedList[t];
                                        butT.performClick();
                                        for (int u = t; u < clickedList.length; u++) {
                                            Button butU = clickedList[u];
                                            butU.performClick();
                                            for (int x = u; x < clickedList.length; x++) {
                                                Button butX = clickedList[x];
                                                butX.performClick();

                                                if (boardFull()) {
                                                    String fullSeqPhrase = "Sequence: " + getTheTag(butM) + getTheTag(butN)
                                                            + getTheTag(butO) + getTheTag(butP) + getTheTag(butQ) + getTheTag(butR)
                                                            + getTheTag(butS) + getTheTag(butT) + getTheTag(butU) + getTheTag(butX);
                                                    String fullMCPhrase = "Move Count: 10";
                                                    seq.setText(fullSeqPhrase);
                                                    mc.setText(fullMCPhrase);
                                                    return;
                                                } else {
                                                    butX.performClick();
                                                }
                                            }
                                            butU.performClick();
                                        }
                                        butT.performClick();
                                    }
                                    butS.performClick();
                                }
                                butR.performClick();
                            }
                            butQ.performClick();
                        }
                        butP.performClick();
                    }
                    butO.performClick();
                }
                butN.performClick();
            }
            butM.performClick();
        }

    }

    void whatClicked(){
        if (aClicked == Boolean.TRUE){
            String fullASeqPhrase = sequencePhrase + "A";
            String fullAMcPhrase = moveCountPhrase + count;
            seq.setText(fullASeqPhrase);
            sequencePhrase = sequencePhrase + "A";
            mc.setText(fullAMcPhrase);
            aClicked = Boolean.FALSE;
        }
        if (bClicked == Boolean.TRUE){
            String fullBSeqPhrase = sequencePhrase + "B";
            String fullBMcPhrase = moveCountPhrase + count;
            seq.setText(fullBSeqPhrase);
            sequencePhrase = sequencePhrase + "B";
            mc.setText(fullBMcPhrase);
            bClicked = Boolean.FALSE;
        }
        if (cClicked == Boolean.TRUE){
            String fullCSeqPhrase = sequencePhrase + "C";
            String fullCMcPhrase = moveCountPhrase + count;
            seq.setText(fullCSeqPhrase);
            sequencePhrase = sequencePhrase + "C";
            mc.setText(fullCMcPhrase);
            cClicked = Boolean.FALSE;
        }
        if (dClicked == Boolean.TRUE){
            String fullDSeqPhrase = sequencePhrase + "D";
            String fullDMcPhrase = moveCountPhrase + count;
            seq.setText(fullDSeqPhrase);
            sequencePhrase = sequencePhrase + "D";
            mc.setText(fullDMcPhrase);
            dClicked = Boolean.FALSE;
        }
        if (eClicked == Boolean.TRUE){
            String fullESeqPhrase = sequencePhrase + "E";
            String fullEMcPhrase = moveCountPhrase + count;
            seq.setText(fullESeqPhrase);
            sequencePhrase = sequencePhrase + "E";
            mc.setText(fullEMcPhrase);
            eClicked = Boolean.FALSE;
        }
        if (fClicked == Boolean.TRUE){
            String fullFSeqPhrase = sequencePhrase + "F";
            String fullFMcPhrase = moveCountPhrase + count;
            seq.setText(fullFSeqPhrase);
            sequencePhrase = sequencePhrase + "F";
            mc.setText(fullFMcPhrase);
            fClicked = Boolean.FALSE;
        }
        if (gClicked == Boolean.TRUE){
            String fullGSeqPhrase = sequencePhrase + "G";
            String fullGMcPhrase = moveCountPhrase + count;
            seq.setText(fullGSeqPhrase);
            sequencePhrase = sequencePhrase + "G";
            mc.setText(fullGMcPhrase);
            gClicked = Boolean.FALSE;
        }
        if (hClicked == Boolean.TRUE){
            String fullHSeqPhrase = sequencePhrase + "H";
            String fullHMcPhrase = moveCountPhrase + count;
            seq.setText(fullHSeqPhrase);
            sequencePhrase = sequencePhrase + "H";
            mc.setText(fullHMcPhrase);
            hClicked = Boolean.FALSE;
        }
        if (iClicked == Boolean.TRUE){
            String fullISeqPhrase = sequencePhrase + "I";
            String fullIMcPhrase = moveCountPhrase + count;
            seq.setText(fullISeqPhrase);
            sequencePhrase = sequencePhrase + "I";
            mc.setText(fullIMcPhrase);
            iClicked = Boolean.FALSE;
        }
        if (jClicked == Boolean.TRUE){
            String fullJSeqPhrase = sequencePhrase + "J";
            String fullJMcPhrase = moveCountPhrase + count;
            seq.setText(fullJSeqPhrase);
            sequencePhrase = sequencePhrase + "J";
            mc.setText(fullJMcPhrase);
            jClicked = Boolean.FALSE;
        }
        if(restartClicked == Boolean.TRUE){
            buttonInfo();
            sequencePhrase = "Sequence: ";
            seq.setText(sequencePhrase);
            count = 0;
            moveCountPhrase = "Move Count: ";
            mc.setText(moveCountPhrase);
            restartClicked = Boolean.FALSE;
        }
    }

}
