import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 * Created by Kuba on 2015-09-11.
 */
public class AwesomeTableView extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vBox= new VBox();
        Scene scene = new Scene(vBox,400,200);
        TableColumn<Product,String> nameColumn= new TableColumn();
        nameColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
        nameColumn.setText("Name:");
        TableColumn<Product,Double> priceColumn= new TableColumn<>();
        priceColumn.setCellValueFactory(new PropertyValueFactory<Product, Double>("price"));
        priceColumn.setText("Price:");
        TableView<Product> tableView= new TableView<>();
        tableView.getColumns().addAll(nameColumn,priceColumn);
        tableView.setItems();
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
