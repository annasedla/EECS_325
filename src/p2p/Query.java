package p2p;

public class Query {

    // Private variables
    private String queryID;
    private char queryType;
    private String queryMessage;
    private Peer sourceSocket;


    /**
     *
     * @param queryID
     * @param queryType
     * @param queryMessage
     */
    public Query(String queryID, Peer socket, char queryType, String queryMessage){
        this.queryID = queryID;
        this.queryType = queryType;
        this.queryMessage = queryMessage;
        this.sourceSocket = socket;
    }

    /**
     *
     * @return
     */
    public String getQueryID() {
        return queryID;
    }

    /**
     *
     * @param queryID
     */
    public void setQueryID(String queryID) {
        this.queryID = queryID;
    }

    /**
     *
     * @return
     */
    public char getQueryType() {
        return queryType;
    }

    /**
     *
     * @param queryType
     */
    public void setQueryType(char queryType) {
        this.queryType = queryType;
    }

    /**
     *
     * @return
     */
    public String getQueryMessage() {
        return queryMessage;
    }

    /**
     *
     * @param queryMessage
     */
    public void setQueryMessage(String queryMessage) {
        this.queryMessage = queryMessage;
    }

    public Peer getSourceSocket() {
        return sourceSocket;
    }

    public void setSourceSocket(Peer sourceSocket) {
        this.sourceSocket = sourceSocket;
    }
}
