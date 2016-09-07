package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class StackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
    public void stack(View view) {
        TextView priceTextView1 = (TextView) findViewById(R.id.stack);
        priceTextView1.setText("\nSTACK\n" +
                "\n\nA stack is an abstract data type (ADT), commonly used in most programming languages. " +
                "\n\nIt is named stack as it behaves like a real-world stack, for example − deck of cards or pile of plates etc.\nA real-world stack allows operations at one end only. For example, we can place or remove a card or plate from top of the stack only. Likewise, Stack ADT allows all data operations at one end only. At any given time, We can only access the top element of a stack.\n" +
                "\n\nThis feature makes it LIFO data structure. LIFO stands for Last-in-first-out. Here, the element which is placed (inserted or added) last, is accessed first. In stack terminology, insertion operation is called PUSH operation and removal operation is called POP operation.\n" +
                "\n\nA stack can be implemented by means of Array, Structure, Pointer and Linked-List. Stack can either be a fixed size one or it may have a sense of dynamic resizing. Here, we are going to implement stack using arrays which makes it a fixed size stack implementation.\n" +
                "\n\nBasic Operations\n" +
                "\nStack operations may involve initializing the stack, using it and then de-initializing it. Apart from these basic stuffs, a stack is used for the following two primary operations −\n" +
                "•\tpush() − pushing (storing) an element on the stack.\n" +
                "•\tpop() − removing (accessing) an element from the stack.\n" +
                "\n\nPUSH Operation\n" +
                "The process of putting a new data element onto stack is known as PUSHOperation. Push operation involves series of steps −\n" +
                "•\tStep 1 − Check if stack is full.\n" +
                "•\tStep 2 − If stack is full, produce error and exit.\n" +
                "•\tStep 3 − If stack is not full, increment top to point next empty space.\n" +
                "•\tStep 4 − Add data element to the stack location, where top is pointing.\n" +
                "•\tStep 5 − return success.\n");
        ImageView iv = (ImageView) findViewById(R.id.stackimage1);
        iv.setImageResource(R.drawable.stack3);

        TextView priceTextView2 = (TextView) findViewById(R.id.stack1);
        priceTextView2.setText("\n\nif linked-list is used to implement stack, then in step 3, we need to allocate space dynamically.\n" +
                "\n\nAlgorithm for PUSH operation\n" +
                "\nA simple algorithm for Push operation can be derived as follows −\n" +
                "\nbegin procedure push: stack, data\n" +
                "\n" +
                "   if stack is full\n" +
                "      return null\n" +
                "   endif\n" +
                "   \n" +
                "   top ← top + 1\n" +
                "   \n" +
                "   stack[top] ← data\n" +
                "\n" +
                "end procedure\n" +
                "\n\nImplementation of this algorithm in C, is very easy. See the below code −\n" +
                "\nvoid push(int data) {\n" +
                "   if(!isFull()) {\n" +
                "      top = top + 1;   \n" +
                "      stack[top] = data;\n" +
                "   }else {\n" +
                "      printf(\"Could not insert data, Stack is full.\\n\");\n" +
                "   }\n" +
                "}\n" +
                "\n\nPop Operation\n" +
                "\nAccessing the content while removing it from stack, is known as pop operation. In array implementation of pop() operation, data element is not actually removed, instead top is decremented to a lower position in stack to point to next value. But in linked-list implementation, pop() actually removes data element and deallocates memory space.\n" +
                "\nA POP operation may involve the following steps −\n" +
                "•\tStep 1 − Check if stack is empty.\n" +
                "•\tStep 2 − If stack is empty, produce error and exit.\n" +
                "•\tStep 3 − If stack is not empty, access the data element at which top is pointing.\n" +
                "•\tStep 4 − Decrease the value of top by 1.\n" +
                "•\tStep 5 − return success.\n");

        ImageView iv2 = (ImageView) findViewById(R.id.stackimage2);
        iv2.setImageResource(R.drawable.stack4);


    }
}
