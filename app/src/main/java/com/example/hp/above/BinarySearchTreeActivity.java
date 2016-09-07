package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BinarySearchTreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_search_tree);
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
    public void search_bst(View view)
    {
        TextView previewText= (TextView) findViewById(R.id.bst_search);
        previewText.setText("\n\n\n// C function to search a given key in a given BST\n" +
                "struct node* search(struct node* root, int key)\n" +
                "{\n" +
                "    // Base Cases: root is null or key is present at root\n" +
                "    if (root == NULL || root->key == key)\n" +
                "       return root;\n" +
                "    \n" +
                "    // Key is greater than root's key\n" +
                "    if (root->key < key)\n" +
                "       return search(root->right, key);\n" +
                " \n" +
                "    // Key is smaller than root's key\n" +
                "    return search(root->left, key);\n" +
                "}");
    }
    public void insert_bst(View view)
    {
        TextView previewText= (TextView) findViewById(R.id.bst_insert);
        previewText.setText("\n\n         100                               100\n" +
                "        /   \\        Insert 40            /    \\\n" +
                "      20     500    --------->          20     500 \n" +
                "     /  \\                              /  \\  \n" +
                "    10   30                           10   30\n" +
                "                                              \\   \n" +
                "                                              40" +
                "\n\n\n// C program to demonstrate insert operation in binary search tree\n" +
                "#include<stdio.h>\n" +
                "#include<stdlib.h>\n" +
                "  \n" +
                "struct node\n" +
                "{\n" +
                "    int key;\n" +
                "    struct node *left, *right;\n" +
                "};\n" +
                "  \n" +
                "// A utility function to create a new BST node\n" +
                "struct node *newNode(int item)\n" +
                "{\n" +
                "    struct node *temp =  (struct node *)malloc(sizeof(struct node));\n" +
                "    temp->key = item;\n" +
                "    temp->left = temp->right = NULL;\n" +
                "    return temp;\n" +
                "}\n" +
                "  \n" +
                "// A utility function to do inorder traversal of BST\n" +
                "void inorder(struct node *root)\n" +
                "{\n" +
                "    if (root != NULL)\n" +
                "    {\n" +
                "        inorder(root->left);\n" +
                "        printf(\"%d \\n\", root->key);\n" +
                "        inorder(root->right);\n" +
                "    }\n" +
                "}\n" +
                "  \n" +
                "/* A utility function to insert a new node with given key in BST */\n" +
                "struct node* insert(struct node* node, int key)\n" +
                "{\n" +
                "    /* If the tree is empty, return a new node */\n" +
                "    if (node == NULL) return newNode(key);\n" +
                " \n" +
                "    /* Otherwise, recur down the tree */\n" +
                "    if (key < node->key)\n" +
                "        node->left  = insert(node->left, key);\n" +
                "    else if (key > node->key)\n" +
                "        node->right = insert(node->right, key);   \n" +
                " \n" +
                "    /* return the (unchanged) node pointer */\n" +
                "    return node;\n" +
                "}\n" +
                "  \n" +
                "// Driver Program to test above functions\n" +
                "int main()\n" +
                "{\n" +
                "    /* Let us create following BST\n" +
                "              50\n" +
                "           /     \\\n" +
                "          30      70\n" +
                "         /  \\    /  \\\n" +
                "       20   40  60   80 */\n" +
                "    struct node *root = NULL;\n" +
                "    root = insert(root, 50);\n" +
                "    insert(root, 30);\n" +
                "    insert(root, 20);\n" +
                "    insert(root, 40);\n" +
                "    insert(root, 70);\n" +
                "    insert(root, 60);\n" +
                "    insert(root, 80);\n" +
                "  \n" +
                "    // print inoder traversal of the BST\n" +
                "    inorder(root);\n" +
                "  \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "20\n" +
                "30\n" +
                "40\n" +
                "50\n" +
                "60\n" +
                "70\n" +
                "80\n" +
                "\n\nTime Complexity: The worst case time complexity of search and insert operations is O(h) where h is height of " +
                "\n\nBinary Search Tree. In worst case, we may have to travel from root to the deepest leaf node." +
                "\n\nThe height of a skewed tree may become n and the time complexity of search and insert operation may become O(n).");
    }
    public void delete_bst(View view)
    {
        TextView previewText= (TextView) findViewById(R.id.bst_delete);
        previewText.setText("\n\n1) Node to be deleted is leaf: Simply remove from the tree.\n" +
                "              50                            50\n" +
                "           /     \\         delete(20)      /   \\\n" +
                "          30      70       --------->    30     70 \n" +
                "         /  \\    /  \\                     \\    /  \\ \n" +
                "       20   40  60   80                   40  60   80\n" +
                "\n\n2) Node to be deleted has only one child: Copy the child to the node and delete the child\n" +
                "              50                            50\n" +
                "           /     \\         delete(30)      /   \\\n" +
                "          30      70       --------->    40     70 \n" +
                "            \\    /  \\                          /  \\ \n" +
                "            40  60   80                       60   80\n" +
                "\n\n3) Node to be deleted has two children: Find inorder successor of the node. Copy contents of the inorder successor to the node and delete the inorder successor. Note that inorder predecessor can also be used.\n" +
                "              50                            60\n" +
                "           /     \\         delete(50)      /   \\\n" +
                "          40      70       --------->    40    70 \n" +
                "                 /  \\                            \\ \n" +
                "                60   80                           80\n" +
                "\n\nThe important thing to note is, inorder successor is needed only when right child is not empty. " +
                "\n\nIn this particular case, inorder successor can be obtained by finding the minimum value in right child of the node." +
                "\n\nCODE:\n\n// C program to demonstrate delete operation in binary search tree\n" +
                "#include<stdio.h>\n" +
                "#include<stdlib.h>\n" +
                " \n" +
                "struct node\n" +
                "{\n" +
                "    int key;\n" +
                "    struct node *left, *right;\n" +
                "};\n" +
                " \n" +
                "// A utility function to create a new BST node\n" +
                "struct node *newNode(int item)\n" +
                "{\n" +
                "    struct node *temp =  (struct node *)malloc(sizeof(struct node));\n" +
                "    temp->key = item;\n" +
                "    temp->left = temp->right = NULL;\n" +
                "    return temp;\n" +
                "}\n" +
                " \n" +
                "// A utility function to do inorder traversal of BST\n" +
                "void inorder(struct node *root)\n" +
                "{\n" +
                "    if (root != NULL)\n" +
                "    {\n" +
                "        inorder(root->left);\n" +
                "        printf(\"%d \", root->key);\n" +
                "        inorder(root->right);\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "/* A utility function to insert a new node with given key in BST */\n" +
                "struct node* insert(struct node* node, int key)\n" +
                "{\n" +
                "    /* If the tree is empty, return a new node */\n" +
                "    if (node == NULL) return newNode(key);\n" +
                " \n" +
                "    /* Otherwise, recur down the tree */\n" +
                "    if (key < node->key)\n" +
                "        node->left  = insert(node->left, key);\n" +
                "    else\n" +
                "        node->right = insert(node->right, key);\n" +
                " \n" +
                "    /* return the (unchanged) node pointer */\n" +
                "    return node;\n" +
                "}\n" +
                " \n" +
                "/* Given a non-empty binary search tree, return the node with minimum\n" +
                "   key value found in that tree. Note that the entire tree does not\n" +
                "   need to be searched. */\n" +
                "struct node * minValueNode(struct node* node)\n" +
                "{\n" +
                "    struct node* current = node;\n" +
                " \n" +
                "    /* loop down to find the leftmost leaf */\n" +
                "    while (current->left != NULL)\n" +
                "        current = current->left;\n" +
                " \n" +
                "    return current;\n" +
                "}\n" +
                " \n" +
                "/* Given a binary search tree and a key, this function deletes the key\n" +
                "   and returns the new root */\n" +
                "struct node* deleteNode(struct node* root, int key)\n" +
                "{\n" +
                "    // base case\n" +
                "    if (root == NULL) return root;\n" +
                " \n" +
                "    // If the key to be deleted is smaller than the root's key,\n" +
                "    // then it lies in left subtree\n" +
                "    if (key < root->key)\n" +
                "        root->left = deleteNode(root->left, key);\n" +
                " \n" +
                "    // If the key to be deleted is greater than the root's key,\n" +
                "    // then it lies in right subtree\n" +
                "    else if (key > root->key)\n" +
                "        root->right = deleteNode(root->right, key);\n" +
                " \n" +
                "    // if key is same as root's key, then This is the node\n" +
                "    // to be deleted\n" +
                "    else\n" +
                "    {\n" +
                "        // node with only one child or no child\n" +
                "        if (root->left == NULL)\n" +
                "        {\n" +
                "            struct node *temp = root->right;\n" +
                "            free(root);\n" +
                "            return temp;\n" +
                "        }\n" +
                "        else if (root->right == NULL)\n" +
                "        {\n" +
                "            struct node *temp = root->left;\n" +
                "            free(root);\n" +
                "            return temp;\n" +
                "        }\n" +
                " \n" +
                "        // node with two children: Get the inorder successor (smallest\n" +
                "        // in the right subtree)\n" +
                "        struct node* temp = minValueNode(root->right);\n" +
                " \n" +
                "        // Copy the inorder successor's content to this node\n" +
                "        root->key = temp->key;\n" +
                " \n" +
                "        // Delete the inorder successor\n" +
                "        root->right = deleteNode(root->right, temp->key);\n" +
                "    }\n" +
                "    return root;\n" +
                "}\n" +
                " \n" +
                "// Driver Program to test above functions\n" +
                "int main()\n" +
                "{\n" +
                "    /* Let us create following BST\n" +
                "              50\n" +
                "           /     \\\n" +
                "          30      70\n" +
                "         /  \\    /  \\\n" +
                "       20   40  60   80 */\n" +
                "    struct node *root = NULL;\n" +
                "    root = insert(root, 50);\n" +
                "    root = insert(root, 30);\n" +
                "    root = insert(root, 20);\n" +
                "    root = insert(root, 40);\n" +
                "    root = insert(root, 70);\n" +
                "    root = insert(root, 60);\n" +
                "    root = insert(root, 80);\n" +
                " \n" +
                "    printf(\"Inorder traversal of the given tree \\n\");\n" +
                "    inorder(root);\n" +
                " \n" +
                "    printf(\"\\nDelete 20\\n\");\n" +
                "    root = deleteNode(root, 20);\n" +
                "    printf(\"Inorder traversal of the modified tree \\n\");\n" +
                "    inorder(root);\n" +
                " \n" +
                "    printf(\"\\nDelete 30\\n\");\n" +
                "    root = deleteNode(root, 30);\n" +
                "    printf(\"Inorder traversal of the modified tree \\n\");\n" +
                "    inorder(root);\n" +
                " \n" +
                "    printf(\"\\nDelete 50\\n\");\n" +
                "    root = deleteNode(root, 50);\n" +
                "    printf(\"Inorder traversal of the modified tree \\n\");\n" +
                "    inorder(root);\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "\nInorder traversal of the given tree\n" +
                "20 30 40 50 60 70 80\n" +
                "\nDelete 20\n" +
                "\nInorder traversal of the modified tree\n" +
                "30 40 50 60 70 80\n" +
                "\nDelete 30\n" +
                "\nInorder traversal of the modified tree\n" +
                "40 50 60 70 80\n" +
                "\nDelete 50\n" +
                "\nInorder traversal of the modified tree\n" +
                "40 60 70 80\n" +
                "\nTime Complexity: The worst case time complexity of delete operation is O(h) where h is height of Binary Search Tree. In worst case, we may have to travel from root to the deepest leaf node. The height of a skewed tree may become n and the time complexity of delete operation may become O(n)");
    }

}
