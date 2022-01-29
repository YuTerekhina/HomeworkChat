module rugb.homeworkchat {
    requires javafx.controls;
    requires javafx.fxml;


    opens rugb.homeworkchat to javafx.fxml;
    exports rugb.homeworkchat;
}