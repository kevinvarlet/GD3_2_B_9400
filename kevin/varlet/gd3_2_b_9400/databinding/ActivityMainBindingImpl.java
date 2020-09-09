package kevin.varlet.gd3_2_b_9400.databinding;
import kevin.varlet.gd3_2_b_9400.R;
import kevin.varlet.gd3_2_b_9400.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout, 8);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.EditText mboundView3;
    @NonNull
    private final android.widget.EditText mboundView4;
    @NonNull
    private final android.widget.EditText mboundView5;
    @NonNull
    private final android.widget.EditText mboundView6;
    @NonNull
    private final android.widget.Button mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mhs.npm
            //         is mhs.setNpm((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // mhs
            kevin.varlet.gd3_2_b_9400.Mahasiswa mhs = mMhs;
            // mhs.npm
            java.lang.String mhsNpm = null;
            // mhs != null
            boolean mhsJavaLangObjectNull = false;



            mhsJavaLangObjectNull = (mhs) != (null);
            if (mhsJavaLangObjectNull) {




                mhs.setNpm(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mhs.nama
            //         is mhs.setNama((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // mhs
            kevin.varlet.gd3_2_b_9400.Mahasiswa mhs = mMhs;
            // mhs != null
            boolean mhsJavaLangObjectNull = false;
            // mhs.nama
            java.lang.String mhsNama = null;



            mhsJavaLangObjectNull = (mhs) != (null);
            if (mhsJavaLangObjectNull) {




                mhs.setNama(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mhs.fakultas
            //         is mhs.setFakultas((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // mhs
            kevin.varlet.gd3_2_b_9400.Mahasiswa mhs = mMhs;
            // mhs.fakultas
            java.lang.String mhsFakultas = null;
            // mhs != null
            boolean mhsJavaLangObjectNull = false;



            mhsJavaLangObjectNull = (mhs) != (null);
            if (mhsJavaLangObjectNull) {




                mhs.setFakultas(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mhs.jurusan
            //         is mhs.setJurusan((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // mhs.jurusan
            java.lang.String mhsJurusan = null;
            // mhs
            kevin.varlet.gd3_2_b_9400.Mahasiswa mhs = mMhs;
            // mhs != null
            boolean mhsJavaLangObjectNull = false;



            mhsJavaLangObjectNull = (mhs) != (null);
            if (mhsJavaLangObjectNull) {




                mhs.setJurusan(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mhs.stringIpk
            //         is mhs.setStringIpk((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // mhs
            kevin.varlet.gd3_2_b_9400.Mahasiswa mhs = mMhs;
            // mhs.stringIpk
            java.lang.String mhsStringIpk = null;
            // mhs != null
            boolean mhsJavaLangObjectNull = false;



            mhsJavaLangObjectNull = (mhs) != (null);
            if (mhsJavaLangObjectNull) {




                mhs.setStringIpk(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mhs.hobi
            //         is mhs.setHobi((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // mhs
            kevin.varlet.gd3_2_b_9400.Mahasiswa mhs = mMhs;
            // mhs.hobi
            java.lang.String mhsHobi = null;
            // mhs != null
            boolean mhsJavaLangObjectNull = false;



            mhsJavaLangObjectNull = (mhs) != (null);
            if (mhsJavaLangObjectNull) {




                mhs.setHobi(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[8]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.EditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.EditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.EditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.EditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.Button) bindings[7];
        this.mboundView7.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mhs == variableId) {
            setMhs((kevin.varlet.gd3_2_b_9400.Mahasiswa) variable);
        }
        else if (BR.activity == variableId) {
            setActivity((kevin.varlet.gd3_2_b_9400.MainActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMhs(@Nullable kevin.varlet.gd3_2_b_9400.Mahasiswa Mhs) {
        updateRegistration(0, Mhs);
        this.mMhs = Mhs;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mhs);
        super.requestRebind();
    }
    public void setActivity(@Nullable kevin.varlet.gd3_2_b_9400.MainActivity Activity) {
        this.mActivity = Activity;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.activity);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMhs((kevin.varlet.gd3_2_b_9400.Mahasiswa) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMhs(kevin.varlet.gd3_2_b_9400.Mahasiswa Mhs, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.npm) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.nama) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.fakultas) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.jurusan) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.stringIpk) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.hobi) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String mhsJurusan = null;
        java.lang.String mhsFakultas = null;
        java.lang.String mhsStringIpk = null;
        android.view.View.OnClickListener activityBtnSaveMahasiswa = null;
        java.lang.String mhsNama = null;
        kevin.varlet.gd3_2_b_9400.Mahasiswa mhs = mMhs;
        java.lang.String mhsHobi = null;
        kevin.varlet.gd3_2_b_9400.MainActivity activity = mActivity;
        java.lang.String mhsNpm = null;

        if ((dirtyFlags & 0x1fdL) != 0) {


            if ((dirtyFlags & 0x121L) != 0) {

                    if (mhs != null) {
                        // read mhs.jurusan
                        mhsJurusan = mhs.getJurusan();
                    }
            }
            if ((dirtyFlags & 0x111L) != 0) {

                    if (mhs != null) {
                        // read mhs.fakultas
                        mhsFakultas = mhs.getFakultas();
                    }
            }
            if ((dirtyFlags & 0x141L) != 0) {

                    if (mhs != null) {
                        // read mhs.stringIpk
                        mhsStringIpk = mhs.getStringIpk();
                    }
            }
            if ((dirtyFlags & 0x109L) != 0) {

                    if (mhs != null) {
                        // read mhs.nama
                        mhsNama = mhs.getNama();
                    }
            }
            if ((dirtyFlags & 0x181L) != 0) {

                    if (mhs != null) {
                        // read mhs.hobi
                        mhsHobi = mhs.getHobi();
                    }
            }
            if ((dirtyFlags & 0x105L) != 0) {

                    if (mhs != null) {
                        // read mhs.npm
                        mhsNpm = mhs.getNpm();
                    }
            }
        }
        if ((dirtyFlags & 0x102L) != 0) {



                if (activity != null) {
                    // read activity.btnSaveMahasiswa
                    activityBtnSaveMahasiswa = activity.btnSaveMahasiswa;
                }
        }
        // batch finished
        if ((dirtyFlags & 0x105L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, mhsNpm);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x109L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, mhsNama);
        }
        if ((dirtyFlags & 0x111L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, mhsFakultas);
        }
        if ((dirtyFlags & 0x121L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, mhsJurusan);
        }
        if ((dirtyFlags & 0x141L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, mhsStringIpk);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, mhsHobi);
        }
        if ((dirtyFlags & 0x102L) != 0) {
            // api target 1

            this.mboundView7.setOnClickListener(activityBtnSaveMahasiswa);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mhs
        flag 1 (0x2L): activity
        flag 2 (0x3L): mhs.npm
        flag 3 (0x4L): mhs.nama
        flag 4 (0x5L): mhs.fakultas
        flag 5 (0x6L): mhs.jurusan
        flag 6 (0x7L): mhs.stringIpk
        flag 7 (0x8L): mhs.hobi
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}