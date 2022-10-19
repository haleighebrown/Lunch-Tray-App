package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckoutBindingImpl extends FragmentCheckoutBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.order_summary, 12);
        sViewsWithIds.put(R.id.divider, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCheckoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentCheckoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.Button) bindings[11]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            );
        this.accompanimentPrice.setTag(null);
        this.accompanimentSelection.setTag(null);
        this.cancelButton.setTag(null);
        this.entreePrice.setTag(null);
        this.entreeSelection.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.sidePrice.setTag(null);
        this.sideSelection.setTag(null);
        this.submitButton.setTag(null);
        this.subtotal.setTag(null);
        this.tax.setTag(null);
        this.total.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback7 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
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
        if (BR.CheckoutFragment == variableId) {
            setCheckoutFragment((com.example.lunchtray.ui.order.CheckoutFragment) variable);
        }
        else if (BR.OrderviewModel == variableId) {
            setOrderviewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCheckoutFragment(@Nullable com.example.lunchtray.ui.order.CheckoutFragment CheckoutFragment) {
        this.mCheckoutFragment = CheckoutFragment;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.CheckoutFragment);
        super.requestRebind();
    }
    public void setOrderviewModel(@Nullable com.example.lunchtray.model.OrderViewModel OrderviewModel) {
        this.mOrderviewModel = OrderviewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.OrderviewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeOrderviewModelEntree((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
            case 1 :
                return onChangeOrderviewModelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeOrderviewModelTax((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeOrderviewModelTotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeOrderviewModelSide((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
            case 5 :
                return onChangeOrderviewModelAccompaniment((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeOrderviewModelEntree(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> OrderviewModelEntree, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderviewModelSubtotal(androidx.lifecycle.LiveData<java.lang.String> OrderviewModelSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderviewModelTax(androidx.lifecycle.LiveData<java.lang.String> OrderviewModelTax, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderviewModelTotal(androidx.lifecycle.LiveData<java.lang.String> OrderviewModelTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderviewModelSide(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> OrderviewModelSide, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderviewModelAccompaniment(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> OrderviewModelAccompaniment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        com.example.lunchtray.model.MenuItem orderviewModelEntreeGetValue = null;
        java.lang.String orderviewModelEntreeName = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> orderviewModelEntree = null;
        com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;
        java.lang.String taxAndroidStringTaxOrderviewModelTax = null;
        com.example.lunchtray.model.OrderViewModel orderviewModel = mOrderviewModel;
        java.lang.String totalAndroidStringTotalOrderviewModelTotal = null;
        java.lang.String orderviewModelSubtotalGetValue = null;
        java.lang.String orderviewModelSideName = null;
        java.lang.String orderviewModelTaxGetValue = null;
        java.lang.String orderviewModelTotalGetValue = null;
        java.lang.String orderviewModelEntreeFormattedPrice = null;
        java.lang.String orderviewModelAccompanimentFormattedPrice = null;
        java.lang.String subtotalAndroidStringSubtotalOrderviewModelSubtotal = null;
        java.lang.String orderviewModelSideFormattedPrice = null;
        androidx.lifecycle.LiveData<java.lang.String> orderviewModelSubtotal = null;
        java.lang.String orderviewModelAccompanimentName = null;
        com.example.lunchtray.model.MenuItem orderviewModelSideGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> orderviewModelTax = null;
        androidx.lifecycle.LiveData<java.lang.String> orderviewModelTotal = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> orderviewModelSide = null;
        com.example.lunchtray.model.MenuItem orderviewModelAccompanimentGetValue = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> orderviewModelAccompaniment = null;

        if ((dirtyFlags & 0x1bfL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (orderviewModel != null) {
                        // read OrderviewModel.entree
                        orderviewModelEntree = orderviewModel.getEntree();
                    }
                    updateLiveDataRegistration(0, orderviewModelEntree);


                    if (orderviewModelEntree != null) {
                        // read OrderviewModel.entree.getValue()
                        orderviewModelEntreeGetValue = orderviewModelEntree.getValue();
                    }


                    if (orderviewModelEntreeGetValue != null) {
                        // read OrderviewModel.entree.getValue().name
                        orderviewModelEntreeName = orderviewModelEntreeGetValue.getName();
                        // read OrderviewModel.entree.getValue().formattedPrice
                        orderviewModelEntreeFormattedPrice = orderviewModelEntreeGetValue.getFormattedPrice();
                    }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (orderviewModel != null) {
                        // read OrderviewModel.subtotal
                        orderviewModelSubtotal = orderviewModel.getSubtotal();
                    }
                    updateLiveDataRegistration(1, orderviewModelSubtotal);


                    if (orderviewModelSubtotal != null) {
                        // read OrderviewModel.subtotal.getValue()
                        orderviewModelSubtotalGetValue = orderviewModelSubtotal.getValue();
                    }


                    // read @android:string/subtotal
                    subtotalAndroidStringSubtotalOrderviewModelSubtotal = subtotal.getResources().getString(R.string.subtotal, orderviewModelSubtotalGetValue);
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (orderviewModel != null) {
                        // read OrderviewModel.tax
                        orderviewModelTax = orderviewModel.getTax();
                    }
                    updateLiveDataRegistration(2, orderviewModelTax);


                    if (orderviewModelTax != null) {
                        // read OrderviewModel.tax.getValue()
                        orderviewModelTaxGetValue = orderviewModelTax.getValue();
                    }


                    // read @android:string/tax
                    taxAndroidStringTaxOrderviewModelTax = tax.getResources().getString(R.string.tax, orderviewModelTaxGetValue);
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (orderviewModel != null) {
                        // read OrderviewModel.total
                        orderviewModelTotal = orderviewModel.getTotal();
                    }
                    updateLiveDataRegistration(3, orderviewModelTotal);


                    if (orderviewModelTotal != null) {
                        // read OrderviewModel.total.getValue()
                        orderviewModelTotalGetValue = orderviewModelTotal.getValue();
                    }


                    // read @android:string/total
                    totalAndroidStringTotalOrderviewModelTotal = total.getResources().getString(R.string.total, orderviewModelTotalGetValue);
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (orderviewModel != null) {
                        // read OrderviewModel.side
                        orderviewModelSide = orderviewModel.getSide();
                    }
                    updateLiveDataRegistration(4, orderviewModelSide);


                    if (orderviewModelSide != null) {
                        // read OrderviewModel.side.getValue()
                        orderviewModelSideGetValue = orderviewModelSide.getValue();
                    }


                    if (orderviewModelSideGetValue != null) {
                        // read OrderviewModel.side.getValue().name
                        orderviewModelSideName = orderviewModelSideGetValue.getName();
                        // read OrderviewModel.side.getValue().formattedPrice
                        orderviewModelSideFormattedPrice = orderviewModelSideGetValue.getFormattedPrice();
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (orderviewModel != null) {
                        // read OrderviewModel.accompaniment
                        orderviewModelAccompaniment = orderviewModel.getAccompaniment();
                    }
                    updateLiveDataRegistration(5, orderviewModelAccompaniment);


                    if (orderviewModelAccompaniment != null) {
                        // read OrderviewModel.accompaniment.getValue()
                        orderviewModelAccompanimentGetValue = orderviewModelAccompaniment.getValue();
                    }


                    if (orderviewModelAccompanimentGetValue != null) {
                        // read OrderviewModel.accompaniment.getValue().formattedPrice
                        orderviewModelAccompanimentFormattedPrice = orderviewModelAccompanimentGetValue.getFormattedPrice();
                        // read OrderviewModel.accompaniment.getValue().name
                        orderviewModelAccompanimentName = orderviewModelAccompanimentGetValue.getName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.accompanimentPrice, orderviewModelAccompanimentFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.accompanimentSelection, orderviewModelAccompanimentName);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback7);
            this.submitButton.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entreePrice, orderviewModelEntreeFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entreeSelection, orderviewModelEntreeName);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sidePrice, orderviewModelSideFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sideSelection, orderviewModelSideName);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalOrderviewModelSubtotal);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tax, taxAndroidStringTaxOrderviewModelTax);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, totalAndroidStringTotalOrderviewModelTotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // CheckoutFragment
                com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;
                // CheckoutFragment != null
                boolean checkoutFragmentJavaLangObjectNull = false;



                checkoutFragmentJavaLangObjectNull = (checkoutFragment) != (null);
                if (checkoutFragmentJavaLangObjectNull) {


                    checkoutFragment.submitOrder();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // CheckoutFragment
                com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;
                // CheckoutFragment != null
                boolean checkoutFragmentJavaLangObjectNull = false;



                checkoutFragmentJavaLangObjectNull = (checkoutFragment) != (null);
                if (checkoutFragmentJavaLangObjectNull) {


                    checkoutFragment.cancelOrder();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): OrderviewModel.entree
        flag 1 (0x2L): OrderviewModel.subtotal
        flag 2 (0x3L): OrderviewModel.tax
        flag 3 (0x4L): OrderviewModel.total
        flag 4 (0x5L): OrderviewModel.side
        flag 5 (0x6L): OrderviewModel.accompaniment
        flag 6 (0x7L): CheckoutFragment
        flag 7 (0x8L): OrderviewModel
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}