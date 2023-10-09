package ra.Bt04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FootballTeam> teams = new ArrayList<FootballTeam>();
        List<FootballTeam> teams2=new ArrayList<FootballTeam>();

        teams.add(new FootballTeam(1, "Team A", 22, 60));
        teams.add(new FootballTeam(2, "Team B", 25, 55));
        teams.add(new FootballTeam(3, "Team C", 24, 45));
        teams.add(new FootballTeam(4, "Team D", 21, 70));

        Sorting.bubbleSort(teams);
        System.out.println("Sắp xếp bằng bubble sort:");
        printTeams(teams);

        Sorting.selectionSort(teams);
        System.out.println("\nSắp xếp bằng selection sort:");
        printTeams(teams);

        Sorting.insertionSort(teams);
        System.out.println("\nSắp xếp bằng insertion sort:");
        printTeams(teams);
    }

    public static void printTeams(List<FootballTeam> teams) {
        for (FootballTeam team : teams) {
            System.out.println(team);
        }
    }
}
