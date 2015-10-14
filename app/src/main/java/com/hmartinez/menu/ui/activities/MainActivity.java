package com.hmartinez.menu.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hmartinez.menu.R;
import com.hmartinez.menu.model.Category;
import com.hmartinez.menu.model.Product;
import com.hmartinez.menu.ui.fragments.CategoryListFragment;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.fragment_container) != null) {

            if (savedInstanceState != null) {
                return;
            }

            // Create an instance of ExampleFragment
            CategoryListFragment mainFragment = CategoryListFragment.newInstance(mockData());

            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, mainFragment).commit();
        }


    }

    public ArrayList<Category> mockData(){
        List<Product> meatProducts = getProducts("carne", "Descripción de carne", "https://image.shutterstock.com/display_pic_with_logo/564163/211454377/stock-photo-two-pieces-of-of-grilled-pork-with-herbs-on-a-paper-on-an-old-table-top-view-horizontal-close-up-211454377.jpg");
        List<Product> birdsProducts = getProducts("ave", "Descripción de ave", "https://image.shutterstock.com/display_pic_with_logo/81593/134292284/stock-photo-roasted-chicken-drumsticks-134292284.jpg");
        List<Product> saladProducts = getProducts("ensalada", "Descripción de ensalada", "https://image.shutterstock.com/display_pic_with_logo/94020/171001007/stock-photo-bowl-of-traditional-caesar-salad-with-chicken-and-bacon-isolated-on-white-background-171001007.jpg");
        List<Product> dessertProducts = getProducts("postre", "Descripción de postre", "https://image.shutterstock.com/display_pic_with_logo/438409/102308947/stock-photo-ice-cream-and-berry-fruit-102308947.jpg");
        List<Product> pizzaProducts = getProducts("pizza", "Descripción de pizza", "https://image.shutterstock.com/display_pic_with_logo/698308/698308,1316410880,14/stock-photo-supreme-pizza-lifted-slice-84904912.jpg");
        List<Product> burguerProducts = getProducts("hamburguesa", "Descripción de hamburguesa", "https://image.shutterstock.com/display_pic_with_logo/596689/259773713/stock-photo-grass-fed-bison-hamburger-with-lettuce-and-cheese-259773713.jpg");

        final Category carnes = new Category("Carnes", "Las mejores carnes",
                "https://image.shutterstock.com/display_pic_with_logo/288100/138421859/stock-photo-succulent-thick-juicy-portions-of-grilled-fillet-steak-served-with-tomatoes-and-roast-vegetables-on-138421859.jpg");

        final Category aves = new Category("Aves", "Las mejores aves",
                "https://image.shutterstock.com/display_pic_with_logo/288100/184074431/stock-photo-marinated-grilled-healthy-chicken-breasts-cooked-on-a-summer-bbq-and-served-with-fresh-herbs-and-184074431.jpg");
        final Category ensaladas = new Category("Ensaladas", "Las mejores ensaladas",
                "https://image.shutterstock.com/display_pic_with_logo/137002/194144204/stock-photo-green-salad-made-with-arugula-tomatoes-cheese-mozzarella-balls-and-sesame-on-plate-on-color-194144204.jpg");
        final Category postres = new Category("Postres", "Los mejores postres", "https://pixabay.com/static/uploads/photo/2014/05/23/23/17/dessert-352475__180.jpg");
        final Category pizzas = new Category("Pizzas", "Las mejores pizzas", "https://image.shutterstock.com/display_pic_with_logo/596689/225746563/stock-photo-hot-homemade-pepperoni-pizza-ready-to-eat-225746563.jpg");
        final Category hamburguesas = new Category("Hamburguesas", "Las mejores hamburguesas", "https://pixabay.com/static/uploads/photo/2015/06/18/07/06/burgers-813407__180.jpg");

        carnes.addProduct(meatProducts);
        aves.addProduct(birdsProducts);
        ensaladas.addProduct(saladProducts);
        postres.addProduct(dessertProducts);
        pizzas.addProduct(pizzaProducts);
        hamburguesas.addProduct(burguerProducts);


        ArrayList<Category> mainCategories = new ArrayList<>();

        mainCategories.add(carnes);
        mainCategories.add(aves);
        mainCategories.add(ensaladas);
        mainCategories.add(postres);
        mainCategories.add(pizzas);
        mainCategories.add(hamburguesas);

        return mainCategories;
    }

    @NotNull
    private List<Product> getProducts(String productType, String productDescription, String imageUrl) {
        List<Product> products = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i ++){
            products.add(new Product(String.format("%s %d", productType, i),
                    String.format("%s %d", productDescription,i),
                    imageUrl, "10$"));
        }
        return products;
    }


}
