package com.codeoftheweb.salvo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SpringBootApplication
public class SalvoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalvoApplication.class, args);
	}

		@Bean
		public CommandLineRunner initData(PlayerRepository PlayerRepository, GameRepository GameRepository, GamePlayerRepository gamePlayerRepository) {
			return (args) -> {
				Game Game1 = new Game(LocalDateTime.now());
				Game Game2 = new Game(LocalDateTime.now().minusHours(1));
				Game Game3 = new Game(LocalDateTime.now().minusHours(2));
				Game Game4 = new Game(LocalDateTime.now());
				Game Game5 = new Game(LocalDateTime.now().minusHours(1));
				Game Game6 = new Game(LocalDateTime.now().minusHours(2));
				Player player1 = new Player("c.obrian@ctu.gov");
				Player player2 = new Player("j.bauer@ctu.gov");
				Player player3 = new Player("t.almeida@ctu.gov");
				Player player4 = new Player("d.palmer@whitehouse.gov");



				PlayerRepository.save(player1);
				PlayerRepository.save(player2);
				PlayerRepository.save(player3);
				PlayerRepository.save(player4);
				GameRepository.save(Game1);
				GameRepository.save(Game2);
				GameRepository.save(Game3);
				GameRepository.save(Game4);
				GameRepository.save(Game5);
				GameRepository.save(Game6);

				GamePlayer GameLayer1 = new GamePlayer(Game1, player1,LocalDateTime.now());
				GamePlayer GameLayer2 = new GamePlayer(Game1, player2,LocalDateTime.now());
				GamePlayer GameLayer3 = new GamePlayer(Game2, player1,LocalDateTime.now());
				GamePlayer GameLayer4 = new GamePlayer(Game2, player2,LocalDateTime.now());
				GamePlayer GameLayer5 = new GamePlayer(Game3, player1,LocalDateTime.now());
				GamePlayer GameLayer6 = new GamePlayer(Game3, player3,LocalDateTime.now());

				GamePlayer GameLayer7 = new GamePlayer(Game4, player1,LocalDateTime.now());
				GamePlayer GameLayer8 = new GamePlayer(Game4, player2,LocalDateTime.now());
				GamePlayer GameLayer9 = new GamePlayer(Game5, player2,LocalDateTime.now());
				GamePlayer GameLayer10 = new GamePlayer(Game5, player3,LocalDateTime.now());
				GamePlayer GameLayer11 = new GamePlayer(Game6, player4,LocalDateTime.now());

				gamePlayerRepository.save(GameLayer1);
				gamePlayerRepository.save(GameLayer2);
				gamePlayerRepository.save(GameLayer3);
				gamePlayerRepository.save(GameLayer4);
				gamePlayerRepository.save(GameLayer5);
				gamePlayerRepository.save(GameLayer6);
				gamePlayerRepository.save(GameLayer7);
				gamePlayerRepository.save(GameLayer8);
				gamePlayerRepository.save(GameLayer9);
				gamePlayerRepository.save(GameLayer10);
				gamePlayerRepository.save(GameLayer11);

			};
		}

}
