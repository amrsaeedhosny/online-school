import java.util.ArrayList;

public class TournamentModel
{
	ArrayList <Tournament> tournaments = new ArrayList <Tournament> ();
	
	void insertTournament ( Tournament tournament )
	{
		tournaments.add(tournament);
	}

}
