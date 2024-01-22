package hjfx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setPrefWidth(512);
		root.setPrefHeight(360);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		
		Label label = new Label();
		label.setText("Hello java FX");
		label.setFont(new Font(50));
		
		Button btn = new Button();
		btn.setText("확인");
		btn.setOnAction(e -> Platform.exit());
		
		root.getChildren().add(label);
		root.getChildren().add(btn);
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
//	public AppMain() {
//		System.out.println(Thread.currentThread().getName() + "AppMain() 출력");
//	}
//	
//	@Override
//	public void init() throws Exception {
//		System.out.println(Thread.currentThread().getName() + ": init() 호출");
//	}
//	
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		System.out.println(Thread.currentThread().getName() + ": start() 출력");
//		primaryStage.show(); // 윈도우 보여주기.
//	}
//	
//	@Override
//	public void stop() throws Exception {
//		System.out.println(Thread.currentThread().getName() + ": stop() 호출");
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(Thread.currentThread().getName() + ": mai() 호출");
//		launch(args);
//	}

}
