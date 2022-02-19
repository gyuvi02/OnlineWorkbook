package org.gyula.OnlineWorkbook;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineWorkbookApplication {

	public static void main(String[] args) {

		ConnectionString connectionString = new ConnectionString("mongodb+srv://SzaboGyula:Gyulus99@gygykpalyazat.kljmo.mongodb.net/workbook?retryWrites=true&w=majority");
		MongoClientSettings settings = MongoClientSettings.builder()
				.applyConnectionString(connectionString)
				.serverApi(ServerApi.builder()
						.version(ServerApiVersion.V1)
						.build())
				.build();
//		MongoClient mongoClient = MongoClients.create(settings);
//		MongoDatabase database = mongoClient.getDatabase("test");

		SpringApplication.run(OnlineWorkbookApplication.class, args);
	}

}
