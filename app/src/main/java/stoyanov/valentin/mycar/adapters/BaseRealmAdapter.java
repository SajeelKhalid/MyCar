package stoyanov.valentin.mycar.adapters;

import android.content.Context;

import io.realm.RealmBasedRecyclerViewAdapter;
import io.realm.RealmModel;
import io.realm.RealmResults;
import io.realm.RealmViewHolder;
import stoyanov.valentin.mycar.realm.models.RealmSettings;

public abstract class BaseRealmAdapter<T extends RealmModel, VH extends RealmViewHolder>
        extends RealmBasedRecyclerViewAdapter<T, VH> {

    private int color;
    private String vehicleId;
    private RealmSettings realmSettings;


    public BaseRealmAdapter(Context context, RealmResults realmResults, boolean automaticUpdate,
                            boolean animateResults) {
        super(context, realmResults, automaticUpdate, animateResults);
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setRealmSettings(RealmSettings realmSettings) {
        this.realmSettings = realmSettings;
    }

    public RealmSettings getRealmSettings() {
        return realmSettings;
    }
}