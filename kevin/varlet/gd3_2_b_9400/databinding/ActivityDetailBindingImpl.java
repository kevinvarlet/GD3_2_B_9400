package kevin.varlet.gd3_2_b_9400.databinding;
import kevin.varlet.gd3_2_b_9400.R;
import kevin.varlet.gd3_2_b_9400.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailBindingImpl extends ActivityDetailBinding  {

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
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.Button mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[8]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
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
            setActivity((kevin.varlet.gd3_2_b_9400.DetailActivity) variable);
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
    public void setActivity(@Nullable kevin.varlet.gd3_2_b_9400.DetailActivity Activity) {
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
        else if (fieldId == BR.ipk) {
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
        double mhsIpk = 0.0;
        android.view.View.OnClickListener activityBtnBackClickListener = null;
        java.lang.String mhsFakultas = null;
        java.lang.String mhsNama = null;
        kevin.varlet.gd3_2_b_9400.Mahasiswa mhs = mMhs;
        java.lang.String stringValueOfMhsIpk = null;
        java.lang.String mhsHobi = null;
        kevin.varlet.gd3_2_b_9400.DetailActivity activity = mActivity;
        java.lang.String mhsNpm = null;

        if ((dirtyFlags & 0x1fdL) != 0) {


            if ((dirtyFlags & 0x121L) != 0) {

                    if (mhs != null) {
                        // read mhs.jurusan
                        mhsJurusan = mhs.getJurusan();
                    }
            }
            if ((dirtyFlags & 0x141L) != 0) {

                    if (mhs != null) {
                        // read mhs.Ipk
                        mhsIpk = mhs.getIpk();
                    }


                    // read String.valueOf(mhs.Ipk)
                    stringValueOfMhsIpk = java.lang.String.valueOf(mhsIpk);
            }
            if ((dirtyFlags & 0x111L) != 0) {

                    if (mhs != null) {
                        // read mhs.fakultas
                        mhsFakultas = mhs.getFakultas();
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
                    // read activity.btnBackClickListener
                    activityBtnBackClickListener = activity.btnBackClickListener;
                }
        }
        // batch finished
        if ((dirtyFlags & 0x105L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, mhsNpm);
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

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, stringValueOfMhsIpk);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, mhsHobi);
        }
        if ((dirtyFlags & 0x102L) != 0) {
            // api target 1

            this.mboundView7.setOnClickListener(activityBtnBackClickListener);
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
        flag 6 (0x7L): mhs.Ipk
        flag 7 (0x8L): mhs.hobi
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}