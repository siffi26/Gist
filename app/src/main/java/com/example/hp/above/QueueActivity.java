package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class QueueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);
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
    public void queue(View view) {
        TextView priceTextView1 = (TextView) findViewById(R.id.queue);
        priceTextView1.setText("\nQUEUE\n\nQueue is an abstract data structure, " +
                "somewhat similar to Stack. In contrast to Queue, queue is opened at both end." +
                " One end is always used to insert data (enqueue) and the other is used to remove data (dequeue)." +
                " Queue follows First-In-First-Out methodology, i.e., the data item stored first will be accessed first." +
                "\n\nSame as Queue, queue can also be implemented using Array, Linked-list, Pointer and Structures. For the sake of simplicity we shall implement queue using one-dimensional array.\n" +
                "\n\nBasic Operations\n" +
                "\n\nQueue operations may involve initializing or defining the queue, utilizing it and then completing erasing it from memory. Here we shall try to understand basic operations associated with queues −\n" +
                "•\tenqueue() − add (store) an item to the queue.\n" +
                "•\tdequeue() − remove (access) an item from the queue.\n" +
                "\n\nEnqueue Operation\n" +
                "\nAs queue maintains two data pointers, front and rear, its operations are comparatively more difficult to implement than Queue.\n" +
                "\nThe following steps should be taken to enqueue (insert) data into a queue −\n" +
                "\n•\tStep 1 − Check if queue is full.\n" +
                "•\tStep 2 − If queue is full, produce overflow error and exit.\n" +
                "•\tStep 3 − If queue is not full, increment rear pointer to point next empty space.\n" +
                "•\tStep 4 − Add data element to the queue location, where rear is pointing.\n" +
                "•\tStep 5 − return success.\n" +
                "\nSometimes, we also check that if queue is initialized or not to handle any unforeseen situations.\n" +
                "\nAlgorithm for enqueue operation\n" +
                "\nprocedure enqueue(data)      \n" +
                "   if queue is full\n" +
                "      return overflow\n" +
                "   endif\n" +
                "   \n" +
                "   rear ← rear + 1\n" +
                "   \n" +
                "   queue[rear] ← data\n" +
                "   \n" +
                "   return true\n" +
                "   \n" +
                "end procedure\n" +
                "\n\nImplementation of enqueue() in C programming language −\n" +
                "int enqueue(int data)      \n" +
                "   if(isfull())\n" +
                "      return 0;\n" +
                "   \n" +
                "   rear = rear + 1;\n" +
                "   queue[rear] = data;\n" +
                "   \n" +
                "   return 1;\n" +
                "end procedure\n" +
                "\n\nDequeue Operation\n" +
                "\nAccessing data from queue is a process of two tasks − access the data where front is pointing and remove the data after access. The following steps are taken to perform dequeue operation −\n" +
                "\n•\tStep 1 − Check if queue is empty.\n" +
                "•\tStep 2 − If queue is empty, produce underflow error and exit.\n" +
                "•\tStep 3 − If queue is not empty, access data where front is pointing.\n" +
                "•\tStep 3 − Increment front pointer to point next available data element.\n" +
                "•\tStep 5 − return success.\n" +
                "\nAlgorithm for dequeue operation −\n" +
                "\nprocedure dequeue\n" +
                "   if queue is empty\n" +
                "      return underflow\n" +
                "   end if\n" +
                "\n" +
                "   data = queue[front]\n" +
                "   front ← front + 1\n" +
                "   \n" +
                "   return true\n" +
                "end procedure\n" +
                "\nImplementation of dequeue() in C programming language −\n" +
                "\nint dequeue() {\n" +
                "\n" +
                "   if(isempty())\n" +
                "      return 0;\n" +
                "\n" +
                "   int data = queue[front];\n" +
                "   front = front + 1;\n" +
                "\n" +
                "   return data;\n" +
                "}\n");
    }
}
