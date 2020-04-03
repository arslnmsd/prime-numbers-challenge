package com.arsalan.challenge;

import java.util.Map;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arsalan.challenge.functions.Functions;
import com.arsalan.challenge.functions.ValueFinderFunction;
import com.arsalan.challenge.generator.Generators;
import com.arsalan.challenge.generator.NumbersGenerator;

@SpringBootApplication
public class HubbadoChallengeApplication implements CommandLineRunner {

	@Autowired
	private PrintFancyMatrix printfancyArray;

	@Autowired
	private Map<String, NumbersGenerator> generatorsMap;

	@Autowired
	private Map<String, ValueFinderFunction> functionsMap;

	public static void main(String[] args) {
		SpringApplication.run(HubbadoChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Options options = new Options();
		options.addRequiredOption("r", "rows", true, "number of rows");
		options.addRequiredOption("c", "columns", true, "number of columns");
		options.addRequiredOption("g", "generator", true, "type of number generator: " + Generators.getValues());
		options.addRequiredOption("f", "function", true, "function to apply: " + Functions.getValues());

		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		CommandLine cmd = null;

		if (args.length == 0) {
			formatter.printHelp("hubbado-challenge", options);
			return;
		}
		int rows = 0, columns = 0;
		Generators gen = null;
		Functions func = null;

		try {
			cmd = parser.parse(options, args);
			rows = Integer.valueOf(cmd.getOptionValue('r'));
			columns = Integer.valueOf(cmd.getOptionValue('c'));
			gen = Generators.valueOf(cmd.getOptionValue('g'));
			func = Functions.valueOf(cmd.getOptionValue('f'));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			formatter.printHelp("hubbado-challenge", options);

			System.exit(1);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception: " + e.getMessage());
			formatter.printHelp("hubbado-challenge", options);

			System.exit(1);
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal argument value");
			formatter.printHelp("hubbado-challenge", options);

			System.exit(1);
		}

		printfancyArray.main(rows, columns, generatorsMap.get(gen.name()), functionsMap.get(func.name()));

	}

}
