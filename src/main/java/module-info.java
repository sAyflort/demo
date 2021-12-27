module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.geekbrains.lesson4 to javafx.fxml;
    exports ru.geekbrains.lesson4;
}