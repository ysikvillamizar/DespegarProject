package co.com.accenture.certification.despegarproject.userinterfaces;

public enum OptionPage {
	Despegar("https://www.despegar.com.co");

    private final String url;

    OptionPage(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
