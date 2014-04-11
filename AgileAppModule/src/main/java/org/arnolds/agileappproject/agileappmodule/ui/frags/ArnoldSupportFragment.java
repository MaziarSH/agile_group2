package org.arnolds.agileappproject.agileappmodule.ui.frags;

import android.app.Activity;
import android.support.v4.app.Fragment;

import org.arnolds.agileappproject.agileappmodule.ui.activities.DrawerLayoutFragmentActivity;
import org.arnolds.agileappproject.agileappmodule.utils.IRepositorySelectionSensitive;

public abstract class ArnoldSupportFragment extends Fragment
        implements IRepositorySelectionSensitive {

    private final int menuIndex;

    protected ArnoldSupportFragment(int _menuIndex) {
        menuIndex = _menuIndex;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);

        ((DrawerLayoutFragmentActivity) activity).onSectionAttached(menuIndex);
    }
}
