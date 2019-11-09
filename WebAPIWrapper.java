package dez.steemit.com;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WebAPIWrapper {


	//__init__
	//HTTPCLIENT AND TOKEN Variables
        private static HttpClient client = HttpClient.newHttpClient();
        private static String token;

	//Constructor to initialize token.
        public WebAPIWrapper(String token) {

            WebAPIWrapper.token = token;

        }

	    //Getter for token
        public String getToken() { return token; }

//<-------------------------------API FUNCTION CALLS START -- HERE -------------------------------------->//

        public void getSystemInfo() throws IOException, InterruptedException {

            sendPOST("getSystemInfo", token);

        }

        public void getProfileStatus() throws IOException, InterruptedException {

            sendPOST("getProfileStatus", token);

        }

        public void setProfileStatus(String status, String mood) throws IOException, InterruptedException {

            sendPOST("setProfileStatus", token);

        }

        public void getOwnContact() throws IOException, InterruptedException {

            sendPOST("getOwnContact", token);

        }

        public void getContacts(String filter) throws IOException, InterruptedException {

                String params = "\"filter\": \"" +
                        filter +
                        "\"";

                sendPOSTWithParams("getContacts", params, token);

        }

        public void getContactAvatar(String pk, String coder, String format) throws IOException, InterruptedException {

                String params = "\"pk\": \"" +
                        pk +
                        "\", " +
                        "\"coder\": \"" +
                        coder +
                        "\", " +
                        "\"format\": \"" +
                        format +
                        "\"";

                sendPOSTWithParams("getContactsAvatar", params, token);
        }

        public void getChannelAvatar(String channelID, String coder, String format) throws IOException, InterruptedException {

                String params = "\"channelid\": \"" +
                        channelID +
                        "\", " +
                        "\"coder\": \"" +
                        coder +
                        "\", " +
                        "\"format\": \"" +
                        "\"";

                sendPOSTWithParams("getChannelAvatar", params, token);

        }

        public void setContactGroup(String pk, String groupName) throws IOException, InterruptedException {

                String params = "\"contactPublicKey\": \"" +
                        pk +
                        "\", " +
                        "\"groupName\": \"" +
                        groupName +
                        "\"";

                sendPOSTWithParams("setContactGroup", params, token);

        }

        public void setContactNick(String pk, String newNick) throws IOException, InterruptedException {

                String params = "\"contactPublicKey\": \"" +
                        pk +
                        "\", " +
                        "\"newNick\": \"" +
                        newNick +
                        "\"";

                sendPOSTWithParams("setContactNick", params, token);

        }

        public void sendInstantMessage(String to, String text) throws IOException, InterruptedException {

                String params = "\"to\": \"" +
                        to +
                        "\", " +
                        "\"text\": \"" +
                        text +
                        "\"";

                sendPOSTWithParams("sendInstantMessage", params, token);


        }

        public void sendInstantQuote(String to, String text, String id_message) throws IOException, InterruptedException {

                String params = "\"to\": \"" +
                        to +
                        "\", " +
                        "\"text\": \"" +
                        text +
                        "\", " +
                        "\"id_message\": \"" +
                        id_message +
                        "\"";

                sendPOSTWithParams("sendInstantQuote", params, token);

        }

        public void sendInstantSticker(String to, String collection, String name) throws IOException, InterruptedException {

                String params = "\"to\": \"" +
                        to +
                        "\", " +
                        "\"collection\": \"" +
                        collection +
                        "\", " +
                        "\"name\": \"" +
                        name +
                        "\"";

                sendPOSTWithParams("sendInstantSticker", params, token);

        }

        public void getStickerCollections() throws IOException, InterruptedException {

            sendPOST("sendInstantSticker", token);

        }

        public void getStickerNamesByCollection(String collection_name) {



        }

        public void getImageSticker(String collection_name, String sticker, String sticker_name, String coder) {


        }

        public void sendInstantBuzz(String to, String comments) {



        }

        public void sendInstantInvitation(String to, String channelID, String description, String comments) {


        }

        public void removeInstantMessages(String hex_contact_public_key) {


        }

        public void getContactMessages(String pk) {


        }

        public void sendEmailMessage(String to, String subject, String body) {


        }

        public void sendPayment(String cardid, String to, String amount, String comment, String fromCard) {


        }

        public void getEmailFolder(String folderType, String filter) {


        }

        public void getEmails(String folderType, String filter) {


        }

        public void getEmailsById(String id) {


        }

        public void deleteEmail(String id) {


        }

        public void sendReplyEmailMessage(String id, String body, String subject) {


        }

        public void ForwardEmailMessage(String id, String to, String subject) {


        }

        public void getFinanceSystemInformation() throws IOException, InterruptedException {

            sendPOST("getFinanceSystemInformation", token);

        }

        public void getBalance() throws IOException, InterruptedException {

            sendPOST("getBalance", token);

        }

        public void getFinanceHistory(String filters, String referenceNumber, String toDate, String fromDate,
                                      String batchId, String fromAmount, String toAmount) {



        }

        public void getCards() throws IOException, InterruptedException {

            sendPOST("getCards", token);

        }

        public void addCard(String name, String color, String numbers) {



        }

        public void deleteCard(String cardId) {


        }

        public void enableMining(String enabled) {



        }

        public void enableInterest(String enabled) {


        }

        public void enableHistoryMining(String enabled) {


        }

        public void statusHistoryMining() throws IOException, InterruptedException {

            sendPOST("statusHistoryMining", token);

        }

        public void getMiningBlocks() throws IOException, InterruptedException {

            sendPOST("getMiningBlocks", token);

        }

        public void getMiningInfo() throws IOException, InterruptedException {

            sendPOST("getMiningInfo", token);

        }

        public void getVouchers() throws IOException, InterruptedException {

            sendPOST("getVouchers", token);

        }

        public void createVoucher(String amount) {



        }

        public void useVoucher(String voucherid) {


        }

        public void deleteVoucher(String voucherid) {



        }

        public void getInvoices(String cardId, String invoiceId, String pk, String transactionId, String status,
                                String startDateTime, String endDateTime, String referenceNumber) {


        }

        public void getInvoiceByReferenceNumber() throws IOException, InterruptedException {

                sendPOST("getInvoiceByReferenceNumber", token);

        }

        public void getTransactionIdByReferenceNumber() throws IOException, InterruptedException {

                sendPOST("getTransactionIdByReferenceNumber", token);

        }

        public void sendInvoice(String cardid, String amount, String comment) {



        }

        public void acceptInvoice(String invoiceid) {



        }

        public void declineInvoice(String invoiceid) {



        }

        public void cancelInvoice(String invoiceid) {



        }

        public void requestUnsTransfer(String name, String hexNewOwnerPk) {



        }

        public void acceptUnsTransfer(String requestId) {



        }

        public void declineUnsTransfer(String requestid) {



        }

        public void incomingUnsTransfer() throws IOException, InterruptedException {

                sendPOST("incomingUnsTransfer", token);

        }

        public void outgoingUnsTransfer() throws IOException, InterruptedException {

                sendPOST("outgoingUnsTransfer", token);

        }

        public void storageWipe() throws IOException, InterruptedException {

                sendPOST("storageWipe", token);

        }

        public void sendAuthorizationRequest(String pk, String message) {



        }

        public void acceptAuthorizationRequest(String pk, String message) {



        }

        public void rejectAuthorizationRequest(String pk, String message) {



        }

        public void deleteContact(String pk) {



        }

        public void getChannels(String filter, String channel_type) {



        }

        public void sendChannelMessage(String channelid, String message) {


        }

        public void sendChannelPicture(String channelid, String base64_image, String filename_image) {



        }

        public void joinChannel(String channelId, String password) {


        }

        public void leaveChannel(String channelid) {


        }

        public void getChannelMessages(String channelid) {



        }

        public void getChannelInfo(String channelid) {



        }

        public void getChannelModerators(String channelid) {



        }

        public void getChannelContacts(String channelid) {



        }

        public void getChannelModeratorRight(String channelid, String moderator) {



        }

        public void createChannel(String channel_name, String description, String read_only, String read_only_privacy,
                                  String password, String languages, String hashtags, String geoTag,
                                  String base64_avatar_image, String hide_in_UI) {



        }

        public void modifyChannel(String channel_name, String description, String read_only, String read_only_privacy,
        String password, String languages, String hashtags, String geoTag,
        String base64_avatar_image, String hide_in_UI) {



        }

        public void deleteChannel(String channelid) {



        }

        public void getChannelSystemInfo() throws IOException, InterruptedException {

                sendPOST("getChannelSystemInfo", token);

        }

        public void unsCreateRecordRequest(String nick, String valid, String isPrimary, String Channelid) {



        }

        public void unsModifyRecordRequest(String nick, String valid, String isPrimary) {



        }

        public void unsDeleteRecordRequest(String nick) {



        }

        public void unsSearchByPk(String filter) {



        }

        public void unsSearchByNick(String filter) {



        }

        public void getUnsSyncInfo() throws IOException, InterruptedException {

                sendPOST("getUnsSyncInfo", token);

        }

        public void unsRegisteredNames() throws IOException, InterruptedException {

                sendPOST("unsRegisteredNames", token);

        }

        public void summaryUnsRegisteredNames(String date_from, String date_to) {



        }

        public void clearTrayNotifications() throws IOException, InterruptedException {

                sendPOST("clearTrayNotifications", token);

        }

        public void getNetworkConnections() throws IOException, InterruptedException {

                sendPOST("getNetworkConnections", token);

        }

        public void getProxyMappings() throws IOException, InterruptedException {

                sendPOST("getProxyMappings", token);

        }

        public void createProxyMapping(String srcHost, String srcPort, String dstHost, String dstPort, String enabled) {



        }

        public void enableProxyMapping(String mappingId) {



        }

        public void disableProxyMapping(String mappingId) {



        }

        public void removeProxyMapping(String mappingId) {



        }

        public void lowTrafficMode() throws IOException, InterruptedException {

                sendPOST("lowTrafficMode", token);

        }

        public void setLowTrafficMode(String enabled) {

                String params = new StringBuilder()
                        .append("").toString();
        }

        public void getWhoIsInfo(String nick_or_pk) {

                String params = new StringBuilder()
                        .append("").toString();

        }

        public void requestTreasuryInterestRates() throws IOException, InterruptedException {

                sendPOST("requestTreasuryInterestRates", token);

        }

        public void getTreasuryInterestRates() throws IOException, InterruptedException {

                sendPOST("getTreasuryInterestRates", token);

        }

        public void requestTreasuryTransactionVolumes() throws IOException, InterruptedException {

                sendPOST("requestTreasuryTransactionVolumes", token);

        }

        public void getTreasuryTransactionVolumes() throws IOException, InterruptedException {

                sendPOST("getTreasuryTransactionVolumes", token);

        }

        public void ucodeEncode(String hex_code, String size_image, String coder, String format) {

                String params = new StringBuilder()
                        .append("").toString();

        }

        public void ucodeDecode(String base64_image) {

                String params = new StringBuilder()
                        .append("").toString();

        }

        public void getWebSocketState() throws IOException, InterruptedException {

                sendPOST("getWebSocketState", token);

        }

        public void setWebSocketState(String enabled, String port) throws IOException, InterruptedException {

                String params = "\"enabled\": \"" +
                        enabled +
                        "\", " +
                        "\"port\": \" " +
                        port +
                        "\"";

                sendPOSTWithParams("getWebSocketState", params, token);

        }


//<--------------------------------------------API FUNCTION CALLS END --------------------------------------->//

	//Method to Send JSON POST request using HTTP client.
    private void sendPOST(String method, String token) throws IOException, InterruptedException {


                /*
        Example: --
        Request
            {
                "method": "getSystemInfo",
                "token": "TEMPTOKEN"
            }
        */

            // json formatted data -- See the above format
            String json = "{" +
                    "\"method\":" +
                    "\"" +
                    method +
                    "\", " +
                    "\"token\":" +
                    "\"" +
                    token +
                    "\"" +
                    "}";

            HttpRequest request = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .uri(URI.create("http://127.0.0.1:20000/api/1.0"))
                    .setHeader("User-Agent", "Utopia API Wrapper Bot") // add request header
                    .header("Content-Type", "application/json")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // print status code
            System.out.println(response.statusCode());

            // print response body
            System.out.println(response.body());

        }

        private void sendPOSTWithParams(String method, String params, String token) throws IOException, InterruptedException {

                        /*
                Example: --
                Request
                {
                        "method": "setProfileStatus",
                        "params": {
                        "status": "Available",
                                "mood": "Hi"
                },
                        "token": "TEMPTOKEN"
                }
                */

                // json formatted data -- See the above format
                String json = "{" +
                        "\"method\":" +
                        "\"" +
                        method +
                        "\", " +
                        "\"params\": { " +
                        params +
                        "}, " +
                        "\"token\":" +
                        "\"" +
                        token +
                        "\"" +
                        "}";

                HttpRequest request = HttpRequest.newBuilder()
                        .POST(HttpRequest.BodyPublishers.ofString(json))
                        .uri(URI.create("http://127.0.0.1:20000/api/1.0"))
                        .setHeader("User-Agent", "Utopia API Wrapper Bot") // add request header
                        .header("Content-Type", "application/json")
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                // print status code
                System.out.println(response.statusCode());

                // print response body
                System.out.println(response.body());

        }
    }

