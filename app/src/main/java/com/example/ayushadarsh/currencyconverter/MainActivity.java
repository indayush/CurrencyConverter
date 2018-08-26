package com.example.ayushadarsh.currencyconverter;

import android.content.ContentValues;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    String s1,s2;

    TextView t1;
    double d1,value,d2;
    int count1 =1,count2 =1;
    int check ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner ip = (Spinner)findViewById(R.id.drop_down1);
        Spinner op = (Spinner)findViewById(R.id.drop_down2);

        //Input Spinner

       ip.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               if (count1==1){
               //To discard the choosing of first value i.e. Dollar by default. Comment the if part to see the effect.
               count1++;
           }
           else {

               switch (position) {
                   case 0:
                       Log.i("Item", "Dollar Value");
                       check = 0;
                       Toast.makeText(MainActivity.this,"Choose Cuurency 2", Toast.LENGTH_SHORT).show();
                       break;
                   case 1:
                       Log.i("Item", "Rupee Value");
                       check = 1;
                       Toast.makeText(MainActivity.this,"Choose Cuurency 2", Toast.LENGTH_SHORT).show();
                       break;
                   case 2:
                       Log.i("Item", "Euro Value");
                       check = 2;
                       Toast.makeText(MainActivity.this,"Choose Cuurency 2", Toast.LENGTH_SHORT).show();
                       break;
                   case 3:
                       Log.i("Item", "Pound Value");
                       check = 3;
                       Toast.makeText(MainActivity.this,"Choose Cuurency 2", Toast.LENGTH_SHORT).show();
                       break;
                   case 4:
                       Log.i("Item", "Yen Value");
                       check = 4;
                       Toast.makeText(MainActivity.this,"Choose Cuurency 2", Toast.LENGTH_SHORT).show();
                       break;
               }

               }
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {
               Toast.makeText(MainActivity.this, "Choose a Currency !!!", Toast.LENGTH_SHORT).show();

           }
       });


        //Output Spinner



       op.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               if (count2==1){
                   //To discard the choosing of first value i.e. Dollar by default. Comment the if part to see the effect.
                   count2++;
               }
               else {
                   Toast.makeText(MainActivity.this, parent.getSelectedItem().toString()+" Selected", Toast.LENGTH_SHORT).show();
               }
               //---------------------------------------------------------

               if (check==0){
                   switch (position){
                       case 0:
                           Log.i("Item","Dollar Value");
                           d2 = 1;
                           break;
                       case 1:
                           Log.i("Item","Rupee Value");
                           d2 = 69.78;
                           break;
                       case 2:
                           Log.i("Item","Euro Value");
                           d2 = 0.86;
                           break;
                       case 3:
                           Log.i("Item","Pound Value");
                           d2 = 0.78;
                           break;
                       case 4:
                           Log.i("Item","Yen Value");
                           d2 = 111.24;
                           break;
                       //default:
                       //  Toast.makeText(MainActivity.this, "Select a Currency", Toast.LENGTH_SHORT).show();

                   }

               }
               //---------------------------------------------------------


               if (check==1){
                   switch (position){
                       case 0:
                           Log.i("Item","Dollar Value");
                           d2 = 0.014;
                           break;
                       case 1:
                           Log.i("Item","Rupee Value");
                           d2 = 1;
                           break;
                       case 2:
                           Log.i("Item","Euro Value");
                           d2 = 0.012;
                           break;
                       case 3:
                           Log.i("Item","Pound Value");
                           d2 = 0.011;
                           break;
                       case 4:
                           Log.i("Item","Yen Value");
                           d2 = 1.59;
                           break;
                       //default:
                       //  Toast.makeText(MainActivity.this, "Select a Currency", Toast.LENGTH_SHORT).show();

                   }

               }
               //---------------------------------------------------------

               if (check==2){
                   switch (position){
                       case 0:
                           Log.i("Item","Dollar Value");
                           d2 = 1.16;
                           break;
                       case 1:
                           Log.i("Item","Rupee Value");
                           d2 = 81.17;
                           break;
                       case 2:
                           Log.i("Item","Euro Value");
                           d2 = 1;
                           break;
                       case 3:
                           Log.i("Item","Pound Value");
                           d2 = 0.91;
                           break;
                       case 4:
                           Log.i("Item","Yen Value");
                           d2 = 129.40;
                           break;
                       //default:
                       //  Toast.makeText(MainActivity.this, "Select a Currency", Toast.LENGTH_SHORT).show();

                   }

               }
               //---------------------------------------------------------
               if (check==3){
                   switch (position){
                       case 0:
                           Log.i("Item","Dollar Value");
                           d2 = 1.28;
                           break;
                       case 1:
                           Log.i("Item","Rupee Value");
                           d2 = 89.63;
                           break;
                       case 2:
                           Log.i("Item","Euro Value");
                           d2 = 1.10;
                           break;
                       case 3:
                           Log.i("Item","Pound Value");
                           d2 = 1;
                           break;
                       case 4:
                           Log.i("Item","Yen Value");
                           d2 = 142.86;
                           break;
                       //default:
                       //  Toast.makeText(MainActivity.this, "Select a Currency", Toast.LENGTH_SHORT).show();

                   }

               }
               //---------------------------------------------------------
               if (check==4){
                   switch (position){
                       case 0:
                           Log.i("Item","Dollar Value");
                           d2 = 0.009;
                           break;
                       case 1:
                           Log.i("Item","Rupee Value");
                           d2 = 0.63;
                           break;
                       case 2:
                           Log.i("Item","Euro Value");
                           d2 = 0.0078;
                           break;
                       case 3:
                           Log.i("Item","Pound Value");
                           d2 = 0.007;
                           break;
                       case 4:
                           Log.i("Item","Yen Value");
                           d2 = 1;
                           break;
                       //default:
                       //  Toast.makeText(MainActivity.this, "Select a Currency", Toast.LENGTH_SHORT).show();

                   }

               }
               //---------------------------------------------------------
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });


    }
    public void convert(View view){
        EditText e1 = (EditText)findViewById(R.id.input_value);
        TextView t1 = (TextView)findViewById(R.id.answer);
        Log.i("Value",e1.getText().toString());
        s1 = e1.getText().toString();

        if (s1.matches(""))
        {
            Toast.makeText(this, "Enter Value First", Toast.LENGTH_SHORT).show();
        }else
        {

            d1 = Double.parseDouble(s1);

            value = d1 * d2;

            s2 = String.format("%.3f", value);//To round off to 2 decimal places

            t1.setText(s2);

            //To hide keyborad on button press

            try  {
                InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
            } catch (Exception e) {  }

        }
    }
}
