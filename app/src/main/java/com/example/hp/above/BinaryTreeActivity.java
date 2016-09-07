package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class BinaryTreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_tree);
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
    public void binarytree(View view) {
        TextView priceTextView1 = (TextView) findViewById(R.id.binarytree);
        priceTextView1.setText("\n\nIn C, we can represent a tree node using structures. Below is an example of a tree node with an integer data.\n" +
                "\nstruct node \n" +
                "{\n" +
                "  int data;\n" +
                "  struct node *left;\n" +
                "  struct node *right;\n" +
                "};" +
                "\n\nFirst Simple Tree in C\n" +
                "\n\nLet us create a simple tree with 4 nodes in C. The created tree would be as following.\n" +
                "      tree\n" +
                "      ----\n" +
                "       1    <-- root\n" +
                "     /   \\\n" +
                "    2     3  \n" +
                "   /   \n" +
                "  4" +
                "\n\nstruct node \n" +
                "{\n" +
                "    int data;\n" +
                "    struct node *left;\n" +
                "    struct node *right;\n" +
                "};\n" +
                " \n" +
                "/* newNode() allocates a new node with the given data and NULL left and \n" +
                "   right pointers. */\n" +
                "struct node* newNode(int data)\n" +
                "{\n" +
                "  // Allocate memory for new node \n" +
                "  struct node* node = (struct node*)malloc(sizeof(struct node));\n" +
                " \n" +
                "  // Assign data to this node\n" +
                "  node->data = data;\n" +
                " \n" +
                "  // Initialize left and right children as NULL\n" +
                "  node->left = NULL;\n" +
                "  node->right = NULL;\n" +
                "  return(node);\n" +
                "}\n" +
                " \n" +
                " \n" +
                "int main()\n" +
                "{\n" +
                "  /*create root*/\n" +
                "  struct node *root = newNode(1);  \n" +
                "  /* following is the tree after above statement \n" +
                " \n" +
                "        1\n" +
                "      /   \\\n" +
                "     NULL  NULL  \n" +
                "  */\n" +
                "   \n" +
                " \n" +
                "  root->left        = newNode(2);\n" +
                "  root->right       = newNode(3);\n" +
                "  /* 2 and 3 become left and right children of 1\n" +
                "           1\n" +
                "         /   \\\n" +
                "        2      3\n" +
                "     /    \\    /  \\\n" +
                "    NULL NULL NULL NULL\n" +
                "  */\n" +
                " \n" +
                " \n" +
                "  root->left->left  = newNode(4);\n" +
                "  /* 4 becomes left child of 2\n" +
                "           1\n" +
                "       /       \\\n" +
                "      2          3\n" +
                "    /   \\       /  \\\n" +
                "   4    NULL  NULL  NULL\n" +
                "  /  \\\n" +
                "NULL NULL\n" +
                "*/\n" +
                " \n" +
                "  getchar();\n" +
                "  return 0;\n" +
                "}" +
                "\n\nSummary: Tree is a hierarchical data structure." +
                "\n Main uses of trees include maintaining hierarchical data, providing moderate access and insert/delete operations." +
                "\n Binary trees are special cases of tree where every node has at most two children." +
                "\n\n\nTree TraversalsDepth First Traversals:\n" +
                "(a) Inorder\n" +
                "(b) Preorder\n" +
                "(c) Postorder\n" +
                "\n" +
                "\n\nBreadth First or Level Order Traversal\n" +
                "\n" +
                "\nInorder Traversal:\n" +
                "\n" +
                "\nAlgorithm Inorder(tree)\n" +
                "   1. Traverse the left subtree, i.e., call Inorder(left-subtree)\n" +
                "   2. Visit the root.\n" +
                "   3. Traverse the right subtree, i.e., call Inorder(right-subtree)\n" +
                "\nUses of Inorder\n" +
                "\nIn case of binary search trees (BST), Inorder traversal gives nodes in non-decreasing order. To get nodes of BST in non-increasing order, a variation of Inorder traversal where Inorder itraversal s reversed, can be used.\n" +
                "\nExample: Inorder traversal for the above given figure is 4 2 5 1 3.\n" +
                "\n" +
                "\nPreorder Traversal:\n" +
                "\n" +
                "\nAlgorithm Preorder(tree)\n" +
                "   1. Visit the root.\n" +
                "   2. Traverse the left subtree, i.e., call Preorder(left-subtree)\n" +
                "   3. Traverse the right subtree, i.e., call Preorder(right-subtree)\n" +
                "\nUses of Preorder\n" +
                "\nPreorder traversal is used to create a copy of the tree. Preorder traversal is also used to get prefix expression on of an expression tree. Please see http://en.wikipedia.org/wiki/Polish_notation to know why prefix expressions are useful.\n" +
                "\nExample: Preorder traversal for the above given figure is 1 2 4 5 3.\n" +
                "\n" +
                "\nPostorder Traversal:\n" +
                "\n" +
                "\nAlgorithm Postorder(tree)\n" +
                "   1. Traverse the left subtree, i.e., call Postorder(left-subtree)\n" +
                "   2. Traverse the right subtree, i.e., call Postorder(right-subtree)\n" +
                "   3. Visit the root.\n" +
                "\nUses of Postorder\n" +
                "\nPostorder traversal is used to delete the tree.");
    }
}
