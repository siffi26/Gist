package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HashingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hashing);
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
    public void hash_more(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.hash_more);
        previewText.setText("\n\nComparison of above three:\n" +
                "\n\nLinear probing has the best cache performance, but suffers from clustering. One more advantage of Linear probing is easy to compute.\n" +
                "\nQuadratic probing lies between the two in terms of cache performance and clustering.\n" +
                "\n\nDouble hashing has poor cache performance but no clustering. Double hashing requires more computation time as two hash functions need to be computed.\n" +
                "\n\nOpen Addressing vs. Separate Chaining\n" +
                "\n1) Chaining is Simpler to implement.\n" +
                "\n2) In chaining, Hash table never fills up, we can always add more elements to chain. In open addressing, table may become full.\n" +
                "\n3) Chaining is Less sensitive to the hash function or load factors.\n" +
                "\n4) Chaining is mostly used when it is unknown how many and how frequently keys may be inserted or deleted.\n" +
                "\n5) Open addressing requires extra care for to avoid clustering and load factor.\n" +
                "\n\nAdvantages of Separate Chaining:\n" +
                "\n1) Simple to implement.\n" +
                "\n2) Hash table never fills up, we can always add more elements to chain.\n" +
                "\n3) Less sensitive to the hash function or load factors.\n" +
                "\n4) It is mostly used when it is unknown how many and how frequently keys may be inserted or deleted.\n" +
                "\n\nDisadvantages of Separate Chaining:\n" +
                "\n1) Cache performance of chaining is not good as keys are stored using linked list. Open addressing provides better cache performance as everything is stored in same table.\n" +
                "\n2) Wastage of Space (Some Parts of hash table are never used)\n" +
                "\n3) If the chain becomes long, then search time can become O(n) in worst case.\n" +
                "\n4) Uses extra space for links.\n" +
                "\n" +
                "\n" +
                "\nPerformance of Chaining:\n" +
                "\nPerformance of hashing can be evaluated under the assumption that each key is equally likely to be hashed to any slot of table (simple uniform hashing).\n" +
                "\n m = Number of slots in hash table\n" +
                "\n n = Number of keys to be inserted in has table\n" +
                " \n" +
                "\n Load factor α = n/m \n" +
                "  \n" +
                "\n Expected time to search = O(1 + α)\n" +
                " \n" +
                "\n Expected time to insert/delete = O(1 + α)\n" +
                "\n" +
                "\n Time complexity of search insert and delete is \n" +
                "\n O(1) if  α is O(1)" +

                "\nAdvantages of Open Addressing\n" +
                "\n1) Cache performance of chaining is not good as keys are stored using linked list. Open addressing provides better cache performance as everything is stored in same table.\n" +
                "\n2) Wastage of Space (Some Parts of hash table in chaining are never used). In Open addressing, a slot can be used even if an input doesn’t map to it.\n" +
                "\n3) Chaining uses extra space for links.\n" +
                "\n\nPerformance of Open Addressing:\n" +
                "\n\nLike Chaining, performance of hashing can be evaluated under the assumption that each key is equally likely to be hashed to any slot of table (simple uniform hashing)\n" +
                "\n m = Number of slots in hash table\n" +
                "\n n = Number of keys to be inserted in has table\n" +
                " \n" +
                "\n Load factor α = n/m  ( < 1 )\n" +
                "\n" +
                "\n Expected time to search/insert/delete < 1/(1 - α) \n" +
                "\n" +
                "\n So Search, Insert and Delete take (1/(1 - α)) time");
    }
}
