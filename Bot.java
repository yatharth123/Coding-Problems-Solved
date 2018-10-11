public interface Bot {
    void onMatchStarted(MatchConfig matchConfig);
    void onNextTick(TickState tickState);
    void onParsingError(String message);
}