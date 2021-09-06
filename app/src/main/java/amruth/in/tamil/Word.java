package amruth.in.tamil;

public class Word {

    private String mDefaultTranslation;
    private String mTamilTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mTamilTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String TamilTranslation, int ImageResourceId){
        mDefaultTranslation = defaultTranslation;
        mTamilTranslation = TamilTranslation;
        mImageResourceId = ImageResourceId;
    }

    public String getDefaultTranslation(){

        return mDefaultTranslation;
    }

    public String getTamilTranslation(){

        return mTamilTranslation;
    }

    public int getImageResourceId() {

        return mImageResourceId;
    }

    public boolean hasImage(){

        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
