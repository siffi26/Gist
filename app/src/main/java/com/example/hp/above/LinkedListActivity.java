package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LinkedListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linked_list);
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
    public void linkedlist(View view) {
        TextView priceTextView1 = (TextView) findViewById(R.id.linkedlist);
        priceTextView1.setText("\nLinked List Representation   \n•\tLinkedList contains an link element called first.\n" +"•\tEach Link carries a data field(s) and a Link Field called next.\n" +
                "•\tEach Link is linked with its next link using its next link.\n" +
                "•\tLast Link carries a Link as null to mark the end of the list.\n  \n\nBasic Operations\n" +
                "\nFollowing are the basic operations supported by a list.\n\n\nInsertion Operation\n\n" +
                "\nInsertion is a three step process −\n" +
                "•\tCreate a new Link with provided data.\n" +
                "•\tPoint New Link to old First Link.\n" +
                "•\tPoint First Link to this New Link.\n"+"\n//insert link at the first location\n" +
                "void insertFirst(int key, int data){\n" +
                "   //create a link\n" +
                "   struct node *link = (struct node*) malloc(sizeof(struct node));\n" +
                "   link->key = key;\n   link->data = data;\n" +
                "\t\n" +
                "   //point it to old first node\n" +
                "   link->next = head;\n" +
                "\t\n" +
                "   //point first to new first node\n" +
                "   head = link;\n" +
                "}\nDeletion Operation\n" +
                "\n\n\nDeletion is a two step process −\n" +
                "•\tGet the Link pointed by First Link as Temp Link.\n" +
                "•\tPoint First Link to Temp Link's Next Link.\n"+"\n\n///delete first item\n" +
                "struct node* deleteFirst(){\n" +
                "   //save reference to first link\n" +
                "   struct node *tempLink = head;\n" +
                "\t\n" +
                "   //mark next to first link as first \n" +
                "   head = head->next;\n" +
                "\t\n" +
                "   //return the deleted link\n" +
                "   return tempLink;\n" +
                "}\n\n\n DOUBLY LINKED LIST\n\nDoubly Linked List is a variation of Linked list in which navigation is possible in both ways either forward and backward easily as compared to Single Linked List. Following are important terms to understand the concepts of doubly Linked List\n" +
                "•\tLink − Each Link of a linked list can store a data called an element.\n" +
                "•\tNext − Each Link of a linked list contain a link to next link called Next.\n" +
                "•\tPrev − Each Link of a linked list contain a link to previous link called Prev.\n" +
                "•\tLinkedList − A LinkedList contains the connection link to the first Link called First and to the last link called Last.\n"+
                "\nAs per above shown illustration, following are the important points to be considered.\n" +
                "•\tDoubly LinkedList contains an link element called first and last.\n" +
                "•\tEach Link carries a data field(s) and a Link Field called next.\n" +
                "•\tEach Link is linked with its next link using its next link.\n" +
                "•\tEach Link is linked with its previous link using its prev link.\n" +
                "•\tLast Link carries a Link as null to mark the end of the list.\n" +
                "\n\nInsertion Operation\n" +
                "\nFollowing code demonstrate insertion operation at beginning in a doubly linked list.\n" +
                "//insert link at the first location\n" +
                "void insertFirst(int key, int data) {\n" +
                "\n" +
                "   //create a link\n" +
                "   struct node *link = (struct node*) malloc(sizeof(struct node));\n" +
                "   link->key = key;\n" +
                "   link->data = data;\n" +
                "\t\n" +
                "   if(isEmpty()) {\n" +
                "      //make it the last link\n" +
                "      last = link;\n" +
                "   }else {\n" +
                "      //update first prev link\n" +
                "      head->prev = link;\n" +
                "   }\n" +
                "\n" +
                "   //point it to old first link\n" +
                "   link->next = head;\n" +
                "\t\n" +
                "   //point first to new first link\n" +
                "   head = link;\n" +
                "}\n" +
                "\n\nDeletion Operation\n" +
                "\nFollowing code demonstrate deletion operation at beginning in a doubly linked list.\n" +
                "//delete first item\n" +
                "struct node* deleteFirst() {\n" +
                "\n" +
                "   //save reference to first link\n" +
                "   struct node *tempLink = head;\n" +
                "\t\n" +
                "   //if only one link\n" +
                "   if(head->next == NULL) {\n" +
                "      last = NULL;\n" +
                "   }else {\n" +
                "      head->next->prev = NULL;\n" +
                "   }\n" +
                "\t\n" +
                "   head = head->next;\n" +
                "\t\n" +
                "   //return the deleted link\n" +
                "   return tempLink;\n" +
                "}\n" +
                "\nInsertion at End Operation\n" +
                "\nFollowing code demonstrate insertion operation at last position in a doubly linked list.\n" +
                "//insert link at the last location\n" +
                "void insertLast(int key, int data) {\n" +
                "\n" +
                "   //create a link\n" +
                "   struct node *link = (struct node*) malloc(sizeof(struct node));\n" +
                "   link->key = key;\n" +
                "   link->data = data;\n" +
                "\t\n" +
                "   if(isEmpty()) {\n" +
                "      //make it the last link\n" +
                "      last = link;\n" +
                "   }else {\n" +
                "      //make link a new last link\n" +
                "      last->next = link;     \n" +
                "      //mark old last node as prev of new link\n" +
                "      link->prev = last;\n" +
                "   }\n" +
                "\n" +
                "   //point last to new last node\n" +
                "   last = link;\n" +
                "}\n" +
                "\n\nCircular Linked List is a variation of Linked list in which first element points to last element and last element points to first element. Both Singly Linked List and Doubly Linked List can be made into as circular linked list.\n" +
                "Singly Linked List as Circular\n" +
                "In singly linked list, the next pointer of the last node points to the first node.\n"
        +"\n\nDoubly Linked List as Circular\n" +
                "In doubly linked list, the next pointer of the last node points to the first node and the previous pointer of the first node points to the last node making the circular in both directions.\n"
                +"\nAs per above shown illustrations, following are the important points to be considered.\n" +
                "•\tLast Link's next points to first link of the list in both cases of singly as well as doubly linked list.\n" +
                "•\tFirst Link's prev points to the last of the list in case of doubly linked list.\n" +
                "\nBasic Operations\n" +
                "\nFollowing are the important operations supported by a circular list.\n" +
                "•\tinsert − insert an element in the start of the list.\n" +
                "•\tdelete − insert an element from the start of the list.\n" +
                "•\tdisplay − display the list.\n" +
                "\nInsertion Operation\n" +
                "\nFollowing code demonstrate insertion operation at in a circular linked list based on single linked list.\n" +
                "//insert link at the first location\n" +
                "void insertFirst(int key, int data) {\n" +
                "   //create a link\n" +
                "   struct node *link = (struct node*) malloc(sizeof(struct node));\n" +
                "   link->key = key;\n" +
                "   link->data= data;\n" +
                "\t\n" +
                "   if (isEmpty()) {\n" +
                "      head = link;\n" +
                "      head->next = head;\n" +
                "   }else {\n" +
                "      //point it to old first node\n" +
                "      link->next = head;\n" +
                "\t\t\n" +
                "      //point first to new first node\n" +
                "      head = link;\n" +
                "   }   \n" +
                "   \n" +
                "}\n" +
                "\nDeletion Operation\n" +
                "\nFollowing code demonstrate deletion operation at in a circular linked list based on single linked list.\n" +
                "//delete first item\n" +
                "struct node * deleteFirst() {\n" +
                "   //save reference to first link\n" +
                "   struct node *tempLink = head;\n" +
                "\t\n" +
                "   if(head->next == head){  \n" +
                "      head = NULL;\n" +
                "      return tempLink;\n" +
                "   }     \n" +
                "\n" +
                "   //mark next to first link as first \n" +
                "   head = head->next;\n" +
                "\t\n" +
                "   //return the deleted link\n" +
                "   return tempLink;\n" +
                "}\n" +
                "\nDisplay List Operation\n" +
                "\nFollowing code demonstrate display list operation in a circular linked list.\n" +
                "//display the list\n" +
                "void printList() {\n" +
                "   struct node *ptr = head;\n" +
                "   printf(\"\\n[ \");\n" +
                "\t\n" +
                "   //start from the beginning\n" +
                "   if(head != NULL) {\n" +
                "      while(ptr->next != ptr) {     \n" +
                "         printf(\"(%d,%d) \",ptr->key,ptr->data);\n" +
                "         ptr = ptr->next;\n" +
                "      }\n" +
                "   }\n" +
                "\t\n" +
                "   printf(\" ]\");\n" +
                "}\n");



    }
}
