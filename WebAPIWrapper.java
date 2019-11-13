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

        public void getStickerNamesByCollection(String collection_name) throws IOException, InterruptedException {
                String params = "\"collecton_name\": \"" + collection_name + "\"";
                sendPOSTWithParams("getStickerNamesByCollection", params, token);
        }

        public void getImageSticker(String collection_name, String sticker_name, String coder) throws IOException, InterruptedException {
                String params = "\"collection_name\": \"" + collection_name + "\", " +
                        "\"sticker_name\": \"" + sticker_name + "\", " +
                        "\"coder\": \"" + coder + "\"";
                sendPOSTWithParams("getImageSticker", params, token);
        }

        public void sendInstantBuzz(String to, String comments) throws IOException, InterruptedException {
                String params = "\"to\": \"" + to + "\", " +
                        "\"comments\": \"" + comments + "\"";
                sendPOSTWithParams("sendInstantBuzz", params, token);
        }

        public void sendInstantInvitation(String to, String channelID, String description, String comments) throws IOException, InterruptedException {
                String params = "\to\": \"" + to + "\", " +
                        "\"channelid\": \" " + channelID + "\", " +
                        "\"description\": \"" + description + "\", " +
                        "\"comments\": \"" + comments + "\"";
                sendPOSTWithParams("sendInstantInvitation", params, token);
        }

        public void removeInstantMessages(String hex_contact_public_key) throws IOException, InterruptedException {
                String params = "\"hex_contact_public_key\": \"" + hex_contact_public_key + "\"";
                sendPOSTWithParams("removeInstantMessage", params, token);
        }

        public void getContactMessages(String pk) throws IOException, InterruptedException {
                String params = "\"pk\": \"" + pk + "\"";
                sendPOSTWithParams("getContactMessages", params, token);
        }

        public void sendEmailMessage(String to, String subject, String body) throws IOException, InterruptedException {
                String params = "\"to\": [ \"" + to + "\" ], " +
                        "\"subject\": \"" + subject + "\", " +
                        "\"body\": \"" + body + "\"";
                sendPOSTWithParams("sendEmailMessage", params, token);
        }

        public void sendPayment(String cardid, String to, String amount, String comment, String fromCard) throws IOException, InterruptedException {
                String params = "\"to\": \"" + to + "\", " +
                        "\"comment\": \"" + comment + "\", " +
                        "\"cardid\": \"" + cardid + "\", " +
                        "\"amount\": \"" + amount + "\"";
                sendPOSTWithParams("sendPayment", params, token);
        }

        public void getEmailFolder(String folderType, String filter) throws IOException, InterruptedException {
                String params = "\"folderType\": \"" + folderType + "\", " +
                        "\"filter\": \"" + filter + "\"";
                sendPOSTWithParams("getEmailFolder", params, token);
        }

        public void getEmails(String folderType, String filter) throws IOException, InterruptedException {
                String params = "\"folderType\": \"" + folderType + "\", " +
                        "\"filter\": \"" + filter + "\"";
                sendPOSTWithParams("getEmailFolder", params, token);
        }

        public void getEmailsById(String id) throws IOException, InterruptedException {
                String params = "\"id\": \"" + id + "\"";
                sendPOSTWithParams("getEmailById", params, token);
        }

        public void deleteEmail(String id) throws IOException, InterruptedException {
                String params = "\"id\": \"" + id + "\"";
                sendPOSTWithParams("deleteEmail", params, token);
        }

        public void sendReplyEmailMessage(String id, String body, String subject) throws IOException, InterruptedException {
                String params = "\"id\": \"" + id + "\", " +
                        "\"body\": \"" + body + "\", " +
                        "\"subject\": \"" + subject + "\"";
                sendPOSTWithParams("sendReplyEmailMessage", params, token);
        }

        public void sendForwardEmailMessage(String id, String to, String body, String subject) throws IOException, InterruptedException {
                String params = "\"id\": \"" + id + "\", " +
                        "\"to\": \"" + to + "\", " +
                        "\"body\": \"" + body + "\", " +
                        "\"subject\": \"" + subject + "\"";
                sendPOSTWithParams("sendForwardEmailMessage", params, token);
        }

        public void getFinanceSystemInformation() throws IOException, InterruptedException {
            sendPOST("getFinanceSystemInformation", token);
        }

        public void getBalance() throws IOException, InterruptedException {
            sendPOST("getBalance", token);
        }

        public void getFinanceHistory(String filters, String referenceNumber, String toDate, String fromDate,
                                      String batchId, String fromAmount, String toAmount) throws IOException, InterruptedException {
                String params = "\"filters\": \"" + filters + "\", " +
                        "\"referenceNumber\": \"" + referenceNumber + "\", " +
                        "\"fromDate\": \"" + fromDate + "\", " +
                        "\"toDate\": \"" + toDate + "\", " +
                        "\"batchId\": \"" + batchId + "\", " +
                        "\"fromAmount\": \"" + fromAmount + "\", " +
                        "\"toAmount\": \"" + toAmount + "\"";
                sendPOSTWithParams("getFinanceHistory", params, token);
        }

        public void getCards() throws IOException, InterruptedException {
            sendPOST("getCards", token);
        }

        public void addCard(String name, String color, String numbers) throws IOException, InterruptedException {
                String params = "\"color\": \"" + color + "\", " +
                        "\"name\": \"" + name + "\", " +
                        "\"preorderNumberInCard\": \"" + numbers + "\"";
                sendPOSTWithParams("addCard", params, token);
        }

        public void deleteCard(String cardId) throws IOException, InterruptedException {
                String params = "\"cardId\": \"" + cardId + "\"";
                sendPOSTWithParams("deleteCard", params, token);
        }

        public void enableMining(String enabled) throws IOException, InterruptedException {
                String params = "\"enable\": \"" + enabled + "\"";
                sendPOSTWithParams("enableMining", params, token);
        }

        public void enableInterest(String enabled) throws IOException, InterruptedException {
                String params = "\"enable\": \"" + enabled + "\"";
                sendPOSTWithParams("enableInterest", params, token);
        }

        public void enableHistoryMining(String enabled) throws IOException, InterruptedException {
                String params = "\"enable\": \"" + enabled + "\"";
                sendPOSTWithParams("enableHistoryMining", params, token);
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

        public void createVoucher(String amount) throws IOException, InterruptedException {
                String params = "\"amount\": \"" + amount + "\"";
                sendPOSTWithParams("createVoucher", params, token);
        }

        public void useVoucher(String voucherid) throws IOException, InterruptedException {
                String params = "\"voucherid\": \"" + voucherid + "\"";
                sendPOSTWithParams("useVoucher", params, token);
        }

        public void deleteVoucher(String voucherid) throws IOException, InterruptedException {
                String params = "\"voucherid\": \"" + voucherid + "\"";
                sendPOSTWithParams("deleteVoucher", params, token);
        }

        public void getInvoices(String cardId, String invoiceId, String pk, String transactionId, String status,
                                String startDateTime, String endDateTime, String referenceNumber) throws IOException, InterruptedException {
                String params = "\"cardId\": \""+ cardId + "\", " +
                        "\"invoiceId\": \"" + invoiceId + "\", " +
                        "\"pk\": \"" + pk + "\", " +
                        "\"transactionId\": \"" + transactionId + "\", " +
                        "\"status\": \"" + status + "\", " +
                        "\"startDateTime\": \"" + startDateTime + "\", " +
                        "\"endDateTime\": \"" + endDateTime + "\", " +
                        "\"referenceNumber\": \"" + referenceNumber + "\"";
                sendPOSTWithParams("getInvoices", params, token);
        }

        public void getInvoiceByReferenceNumber() throws IOException, InterruptedException {
                sendPOST("getInvoiceByReferenceNumber", token);
        }

        public void getTransactionIdByReferenceNumber() throws IOException, InterruptedException {
                sendPOST("getTransactionIdByReferenceNumber", token);
        }

        public void sendInvoice(String cardid, String amount, String comment) throws IOException, InterruptedException {
                String params = "\"comment\": \"" + comment + "\", " +
                        "\"cardid\": \"" + cardid  + "\", " +
                        "\"amount\": \"" + amount + "\", ";
                sendPOSTWithParams("sendInvoice", params, token);
        }

        public void acceptInvoice(String invoiceid) throws IOException, InterruptedException {
                String params = "\"invoiceid\": \"" + invoiceid + "\"";
                sendPOSTWithParams("acceptInvoice", params, token);
        }

        public void declineInvoice(String invoiceid) throws IOException, InterruptedException {
                String params = "\"invoiceid\": \"" + invoiceid + "\"";
                sendPOSTWithParams("declineInvoice", params, token);
        }

        public void cancelInvoice(String invoiceid) throws IOException, InterruptedException {
                String params = "\"invoiceid\": \"" + invoiceid + "\"";
                sendPOSTWithParams("cancelInvoice", params, token);
        }

        public void requestUnsTransfer(String name, String hexNewOwnerPk) throws IOException, InterruptedException {
                String params = "\"name\": \"" + name + "\", " +
                        "\"hexNewOwnerPk\": \"" + hexNewOwnerPk + "\"";
                sendPOSTWithParams("requestUnsTransfer", params, token);
        }

        public void acceptUnsTransfer(String requestId) throws IOException, InterruptedException {
                String params = "\"requestId\": \"" + requestId + "\"";
                sendPOSTWithParams("acceptUnsTransfer", params, token);
        }

        public void declineUnsTransfer(String requestId) throws IOException, InterruptedException {
                String params = "\"requestId\": \"" + requestId + "\"";
                sendPOSTWithParams("declineUnsTransfer", params, token);
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

        public void sendAuthorizationRequest(String pk, String message) throws IOException, InterruptedException {
                String params = "\"pk\": \"" + pk + "\", " +
                        "\"message\": \"" + message + "\"";
                sendPOSTWithParams("sendAuthorizationRequest", params, token);
        }

        public void acceptAuthorizationRequest(String pk, String message) throws IOException, InterruptedException {
                String params = "\"pk\": \"" + pk + "\", " +
                        "\"message\": \"" + message + "\"";
                sendPOSTWithParams("acceptAuthorizationRequest", params, token);
        }

        public void rejectAuthorizationRequest(String pk, String message) throws IOException, InterruptedException {
                String params = "\"pk\": \"" + pk + "\", " +
                        "\"message\": \"" + message + "\"";
                sendPOSTWithParams("rejectAuthorizationRequest", params, token);
        }

        public void deleteContact(String pk) throws IOException, InterruptedException {
                String params = "\"pk\": \"" + pk +"\"";
                sendPOSTWithParams("deleteContact", params, token);
        }

        public void getChannels(String filter, String channel_type) throws IOException, InterruptedException {
                String params = "\"filter\": \"" + filter + "\", " +
                        "\"channel_type\": \"" + channel_type + "\"";
                sendPOSTWithParams("getChannels", params, token);
        }

        public void sendChannelMessage(String channelid, String message) throws IOException, InterruptedException {
                String params = "\"channelid\": \"" + channelid + "\", " +
                        "\"message\": \"" + message + "\"";
                sendPOSTWithParams("sendChannelMessage", params, token);
        }

        public void sendChannelPicture(String channelid, String base64_image, String filename_image) throws IOException, InterruptedException {
                String params = "\"channelid\": \"" + channelid + "\", " +
                        "\"base64_image\": \"" + base64_image + "\", " +
                        "\"filename_image\": \"" + filename_image + "\"";
                sendPOSTWithParams("sendChannelPicture", params, token);
        }

        public void joinChannel(String channelId, String password) throws IOException, InterruptedException {
                String params = "\"ident\": \"" + channelId + "\"" +
                        "\"password\": \"" + password + "\"";
                sendPOSTWithParams("joinChannel", params, token);
        }

        public void leaveChannel(String channelid) throws IOException, InterruptedException {
                String params = "\"channelid\": \"" + channelid + "\"";
                sendPOSTWithParams("leaveChannel", params, token);
        }

        public void getChannelMessages(String channelid) throws IOException, InterruptedException {
                String params = "\"channelid\": \"" + channelid + "\"";
                sendPOSTWithParams("getChannelMessage", params, token);
        }

        public void getChannelInfo(String channelid) throws IOException, InterruptedException {
                String params = "\"channelid\": \"" + channelid + "\"";
                sendPOSTWithParams("getChannelInfo", params, token);
        }

        public void getChannelModerators(String channelid) throws IOException, InterruptedException {
                String params = "\"channelid\": \"" + channelid + "\"";
                sendPOSTWithParams("getChannelModerators", params, token);
        }

        public void getChannelContacts(String channelid) throws IOException, InterruptedException {
                String params = "\"channelid\": \"" + channelid + "\"";
                sendPOSTWithParams("getChannelContacts", params, token);
        }

        public void getChannelModeratorRight(String channelid, String moderator) throws IOException, InterruptedException {
                String params = "\"channelid\": \"" + channelid + "\", " +
                        "\"moderator\": \"" + moderator + "\"";
                sendPOSTWithParams("getChannelModeratorRight", params, token);
        }

        public void createChannel(String channel_name, String description, String read_only, String read_only_privacy,
                                  String password, String languages, String hashtags, String geoTag,
                                  String base64_avatar_image, String hide_in_UI) throws IOException, InterruptedException {
                String params = "" +
                        "\"channel_name\": \"" + channel_name + "\", " +
                        "\"description\": \"" + description + "\", " +
                        "\read_only\": \"" + read_only + "\", " +
                        "\"read_only_privacy\": \"" + read_only_privacy +"\", " +
                        "\"password\": \"" + password + "\", " +
                        "\"languages\": \"" + languages + "\", " +
                        "\"hashtags\": \"" + hashtags + "\", " +
                        "\"geoTag\": \"" + geoTag + "\", " +
                        "\"base64_avatar_image\": \"" + base64_avatar_image + "\", " +
                        "\"hide_in_UI\": \"" + hide_in_UI + "\"";
                sendPOSTWithParams("createChannel", params, token);
        }

        public void modifyChannel(String channel_name, String description, String read_only, String read_only_privacy,
        String password, String languages, String hashtags, String geoTag,
        String base64_avatar_image, String hide_in_UI) throws IOException, InterruptedException {
                String params = "" +
                        "\"channel_name\": \"" + channel_name + "\", " +
                        "\"description\": \"" + description + "\", " +
                        "\read_only\": \"" + read_only + "\", " +
                        "\"read_only_privacy\": \"" + read_only_privacy +"\", " +
                        "\"password\": \"" + password + "\", " +
                        "\"languages\": \"" + languages + "\", " +
                        "\"hashtags\": \"" + hashtags + "\", " +
                        "\"geoTag\": \"" + geoTag + "\", " +
                        "\"base64_avatar_image\": \"" + base64_avatar_image + "\", " +
                        "\"hide_in_UI\": \"" + hide_in_UI + "\"";
                sendPOSTWithParams("modifyChannel", params, token);
        }

        public void deleteChannel(String channelid) throws IOException, InterruptedException {
                String params = "\"channelid\": \"" + channelid + "\"";
                sendPOSTWithParams("deleteChannel", params, token);
        }

        public void getChannelSystemInfo() throws IOException, InterruptedException {
                sendPOST("getChannelSystemInfo", token);
        }

        public void unsCreateRecordRequest(String nick, String valid, String isPrimary, String Channelid) throws IOException, InterruptedException {
                String params = "\"nick\": \"" + nick + "\", " +
                        "\"valid\": \"" + valid + "\", " +
                        "\"isPrimary\": \"" + isPrimary + "\", " +
                        "\"channelId\": \"" + Channelid + "\"";
                sendPOSTWithParams("unsCreateRecordRequest", params, token);
        }

        public void unsModifyRecordRequest(String nick, String valid, String isPrimary, String channelId) throws IOException, InterruptedException {
                String params = "\"nick\": \"" + nick + "\", " +
                        "\"valid\": \"" + valid + "\", " +
                        "\"isPrimary\": \"" + isPrimary + "\", " +
                        "\"channelId\": \"" + channelId + "\"";
                sendPOSTWithParams("unsModifyRecordRequest", params, token);
        }

        public void unsDeleteRecordRequest(String nick) throws IOException, InterruptedException {
                String params = "\"nick\": \"" + nick + "\"";
                sendPOSTWithParams("unsDeleteRecordRequest", params, token);
        }

        public void unsSearchByPk(String filter) throws IOException, InterruptedException {
                String params = "\"filter\": \"" + filter + "\"";
                sendPOSTWithParams("unsSearchByPk", params, token);

        }

        public void unsSearchByNick(String filter) throws IOException, InterruptedException {
                String params = "\"filter\": \"" + filter + "\"";
                sendPOSTWithParams("unsSearchByNick", params, token);
        }

        public void getUnsSyncInfo() throws IOException, InterruptedException {
                sendPOST("getUnsSyncInfo", token);
        }

        public void unsRegisteredNames() throws IOException, InterruptedException {
                sendPOST("unsRegisteredNames", token);
        }

        public void summaryUnsRegisteredNames(String date_from, String date_to) throws IOException, InterruptedException {
                String params = "\"fromDate\": \"" + date_from + "\", " +
                        "\"toDate\": \"" + date_to + "\"";
                sendPOSTWithParams("summaryUnsRegisteredNames", params, token);
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

        public void createProxyMapping(String srcHost, String srcPort, String dstHost, String dstPort, String enabled) throws IOException, InterruptedException {
                String params = "\"srcHost\": \"" + srcHost + "\", " +
                        "\"srcPort\": \"" + srcPort + "\", " +
                        "\"dstHost\": \"" + dstHost + "\", " +
                        "\"dstPort\": \"" + dstPort + "\", " +
                        "\"enabled\": \"" + enabled + "\"";
                sendPOSTWithParams("createProxyMapping", params, token);
        }

        public void enableProxyMapping(String mappingId) throws IOException, InterruptedException {
                String params = "\"mappingId\": \"" + mappingId + "\"";
                sendPOSTWithParams("enableProxyMapping", params, token);
        }

        public void disableProxyMapping(String mappingId) throws IOException, InterruptedException {
                String params = "\"mappingId\": \"" + mappingId + "\"";
                sendPOSTWithParams("disableProxyMapping", params, token);
        }

        public void removeProxyMapping(String mappingId) throws IOException, InterruptedException {
                String params = "\"mappingId\": \"" + mappingId + "\"";
                sendPOSTWithParams("removeProxyMapping", params, token);
        }

        public void lowTrafficMode() throws IOException, InterruptedException {
                sendPOST("lowTrafficMode", token);
        }

        public void setLowTrafficMode(String enabled) throws IOException, InterruptedException {
                String params = "\"enabled\": \"" + enabled + "\"";
                sendPOSTWithParams("setLowTrafficMode", params, token);
        }

        public void getWhoIsInfo(String nick_or_pk) throws IOException, InterruptedException {
                String params = "\"owner\": \"" + nick_or_pk + "\"";
                sendPOSTWithParams("getWhoIsInfo", params, token);
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

        public void ucodeEncode(String hex_code, String size_image, String coder, String format) throws IOException, InterruptedException {
                String params = "\"hex_code\": \"" + hex_code + "\", " +
                        "\"size_image\": \"" + size_image + "\", " +
                        "\"coder\": \"" + coder + "\", " +
                        "\"format\": \"" + format + "\"";
                sendPOSTWithParams("ucodeEncode", params, token);
        }

        public void ucodeDecode(String base64_image) throws IOException, InterruptedException {
                String params = "\"base64_image\": \"" + base64_image + "\"";
                sendPOSTWithParams("ucodeDecode", params, token);
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