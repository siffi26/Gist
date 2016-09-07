package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class HuffmanCodingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huffman_coding);
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
    public void huffman_code(View view) {
        TextView tv = (TextView) findViewById(R.id.huffman_code);
        tv.setText("// C program for Huffman Coding\n" +
                "#include <stdio.h>\n" +
                "#include <stdlib.h>\n" +
                " \n" +
                "// This constant can be avoided by explicitly calculating height of Huffman Tree\n" +
                "#define MAX_TREE_HT 100\n" +
                " \n" +
                "// A Huffman tree node\n" +
                "struct MinHeapNode\n" +
                "{\n" +
                "    char data;  // One of the input characters\n" +
                "    unsigned freq;  // Frequency of the character\n" +
                "    struct MinHeapNode *left, *right; // Left and right child of this node\n" +
                "};\n" +
                " \n" +
                "// A Min Heap:  Collection of min heap (or Hufmman tree) nodes\n" +
                "struct MinHeap\n" +
                "{\n" +
                "    unsigned size;    // Current size of min heap\n" +
                "    unsigned capacity;   // capacity of min heap\n" +
                "    struct MinHeapNode **array;  // Attay of minheap node pointers\n" +
                "};\n" +
                " \n" +
                "// A utility function allocate a new min heap node with given character\n" +
                "// and frequency of the character\n" +
                "struct MinHeapNode* newNode(char data, unsigned freq)\n" +
                "{\n" +
                "    struct MinHeapNode* temp =\n" +
                "          (struct MinHeapNode*) malloc(sizeof(struct MinHeapNode));\n" +
                "    temp->left = temp->right = NULL;\n" +
                "    temp->data = data;\n" +
                "    temp->freq = freq;\n" +
                "    return temp;\n" +
                "}\n" +
                " \n" +
                "// A utility function to create a min heap of given capacity\n" +
                "struct MinHeap* createMinHeap(unsigned capacity)\n" +
                "{\n" +
                "    struct MinHeap* minHeap =\n" +
                "         (struct MinHeap*) malloc(sizeof(struct MinHeap));\n" +
                "    minHeap->size = 0;  // current size is 0\n" +
                "    minHeap->capacity = capacity;\n" +
                "    minHeap->array =\n" +
                "     (struct MinHeapNode**)malloc(minHeap->capacity * sizeof(struct MinHeapNode*));\n" +
                "    return minHeap;\n" +
                "}\n" +
                " \n" +
                "// A utility function to swap two min heap nodes\n" +
                "void swapMinHeapNode(struct MinHeapNode** a, struct MinHeapNode** b)\n" +
                "{\n" +
                "    struct MinHeapNode* t = *a;\n" +
                "    *a = *b;\n" +
                "    *b = t;\n" +
                "}\n" +
                " \n" +
                "// The standard minHeapify function.\n" +
                "void minHeapify(struct MinHeap* minHeap, int idx)\n" +
                "{\n" +
                "    int smallest = idx;\n" +
                "    int left = 2 * idx + 1;\n" +
                "    int right = 2 * idx + 2;\n" +
                " \n" +
                "    if (left < minHeap->size &&\n" +
                "        minHeap->array[left]->freq < minHeap->array[smallest]->freq)\n" +
                "      smallest = left;\n" +
                " \n" +
                "    if (right < minHeap->size &&\n" +
                "        minHeap->array[right]->freq < minHeap->array[smallest]->freq)\n" +
                "      smallest = right;\n" +
                " \n" +
                "    if (smallest != idx)\n" +
                "    {\n" +
                "        swapMinHeapNode(&minHeap->array[smallest], &minHeap->array[idx]);\n" +
                "        minHeapify(minHeap, smallest);\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// A utility function to check if size of heap is 1 or not\n" +
                "int isSizeOne(struct MinHeap* minHeap)\n" +
                "{\n" +
                "    return (minHeap->size == 1);\n" +
                "}\n" +
                " \n" +
                "// A standard function to extract minimum value node from heap\n" +
                "struct MinHeapNode* extractMin(struct MinHeap* minHeap)\n" +
                "{\n" +
                "    struct MinHeapNode* temp = minHeap->array[0];\n" +
                "    minHeap->array[0] = minHeap->array[minHeap->size - 1];\n" +
                "    --minHeap->size;\n" +
                "    minHeapify(minHeap, 0);\n" +
                "    return temp;\n" +
                "}\n" +
                " \n" +
                "// A utility function to insert a new node to Min Heap\n" +
                "void insertMinHeap(struct MinHeap* minHeap, struct MinHeapNode* minHeapNode)\n" +
                "{\n" +
                "    ++minHeap->size;\n" +
                "    int i = minHeap->size - 1;\n" +
                "    while (i && minHeapNode->freq < minHeap->array[(i - 1)/2]->freq)\n" +
                "    {\n" +
                "        minHeap->array[i] = minHeap->array[(i - 1)/2];\n" +
                "        i = (i - 1)/2;\n" +
                "    }\n" +
                "    minHeap->array[i] = minHeapNode;\n" +
                "}\n" +
                " \n" +
                "// A standard funvtion to build min heap\n" +
                "void buildMinHeap(struct MinHeap* minHeap)\n" +
                "{\n" +
                "    int n = minHeap->size - 1;\n" +
                "    int i;\n" +
                "    for (i = (n - 1) / 2; i >= 0; --i)\n" +
                "        minHeapify(minHeap, i);\n" +
                "}\n" +
                " \n" +
                "// A utility function to print an array of size n\n" +
                "void printArr(int arr[], int n)\n" +
                "{\n" +
                "    int i;\n" +
                "    for (i = 0; i < n; ++i)\n" +
                "        printf(\"%d\", arr[i]);\n" +
                "    printf(\"\\n\");\n" +
                "}\n" +
                " \n" +
                "// Utility function to check if this node is leaf\n" +
                "int isLeaf(struct MinHeapNode* root)\n" +
                "{\n" +
                "    return !(root->left) && !(root->right) ;\n" +
                "}\n" +
                " \n" +
                "// Creates a min heap of capacity equal to size and inserts all character of \n" +
                "// data[] in min heap. Initially size of min heap is equal to capacity\n" +
                "struct MinHeap* createAndBuildMinHeap(char data[], int freq[], int size)\n" +
                "{\n" +
                "    struct MinHeap* minHeap = createMinHeap(size);\n" +
                "    for (int i = 0; i < size; ++i)\n" +
                "        minHeap->array[i] = newNode(data[i], freq[i]);\n" +
                "    minHeap->size = size;\n" +
                "    buildMinHeap(minHeap);\n" +
                "    return minHeap;\n" +
                "}\n" +
                " \n" +
                "// The main function that builds Huffman tree\n" +
                "struct MinHeapNode* buildHuffmanTree(char data[], int freq[], int size)\n" +
                "{\n" +
                "    struct MinHeapNode *left, *right, *top;\n" +
                " \n" +
                "    // Step 1: Create a min heap of capacity equal to size.  Initially, there are\n" +
                "    // modes equal to size.\n" +
                "    struct MinHeap* minHeap = createAndBuildMinHeap(data, freq, size);\n" +
                " \n" +
                "    // Iterate while size of heap doesn't become 1\n" +
                "    while (!isSizeOne(minHeap))\n" +
                "    {\n" +
                "        // Step 2: Extract the two minimum freq items from min heap\n" +
                "        left = extractMin(minHeap);\n" +
                "        right = extractMin(minHeap);\n" +
                " \n" +
                "        // Step 3:  Create a new internal node with frequency equal to the\n" +
                "        // sum of the two nodes frequencies. Make the two extracted node as\n" +
                "        // left and right children of this new node. Add this node to the min heap\n" +
                "        // '$' is a special value for internal nodes, not used\n" +
                "        top = newNode('$', left->freq + right->freq);\n" +
                "        top->left = left;\n" +
                "        top->right = right;\n" +
                "        insertMinHeap(minHeap, top);\n" +
                "    }\n" +
                " \n" +
                "    // Step 4: The remaining node is the root node and the tree is complete.\n" +
                "    return extractMin(minHeap);\n" +
                "}\n" +
                " \n" +
                "// Prints huffman codes from the root of Huffman Tree.  It uses arr[] to\n" +
                "// store codes\n" +
                "void printCodes(struct MinHeapNode* root, int arr[], int top)\n" +
                "{\n" +
                "    // Assign 0 to left edge and recur\n" +
                "    if (root->left)\n" +
                "    {\n" +
                "        arr[top] = 0;\n" +
                "        printCodes(root->left, arr, top + 1);\n" +
                "    }\n" +
                " \n" +
                "    // Assign 1 to right edge and recur\n" +
                "    if (root->right)\n" +
                "    {\n" +
                "        arr[top] = 1;\n" +
                "        printCodes(root->right, arr, top + 1);\n" +
                "    }\n" +
                " \n" +
                "    // If this is a leaf node, then it contains one of the input\n" +
                "    // characters, print the character and its code from arr[]\n" +
                "    if (isLeaf(root))\n" +
                "    {\n" +
                "        printf(\"%c: \", root->data);\n" +
                "        printArr(arr, top);\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// The main function that builds a Huffman Tree and print codes by traversing\n" +
                "// the built Huffman Tree\n" +
                "void HuffmanCodes(char data[], int freq[], int size)\n" +
                "{\n" +
                "   //  Construct Huffman Tree\n" +
                "   struct MinHeapNode* root = buildHuffmanTree(data, freq, size);\n" +
                " \n" +
                "   // Print Huffman codes using the Huffman tree built above\n" +
                "   int arr[MAX_TREE_HT], top = 0;\n" +
                "   printCodes(root, arr, top);\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above functions\n" +
                "int main()\n" +
                "{\n" +
                "    char arr[] = {'a', 'b', 'c', 'd', 'e', 'f'};\n" +
                "    int freq[] = {5, 9, 12, 13, 16, 45};\n" +
                "    int size = sizeof(arr)/sizeof(arr[0]);\n" +
                "    HuffmanCodes(arr, freq, size);\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:" +
                "\nf: 0\n" +
                "c: 100\n" +
                "d: 101\n" +
                "a: 1100\n" +
                "b: 1101\n" +
                "e: 111\n" +
                "Time complexity: O(nlogn) where n is the number of unique characters. If there are n nodes, extractMin() is called 2*(n – 1) times. extractMin() takes O(logn) time as it calles minHeapify(). So, overall complexity is O(nlogn)." +
                "\n");
    }
}
