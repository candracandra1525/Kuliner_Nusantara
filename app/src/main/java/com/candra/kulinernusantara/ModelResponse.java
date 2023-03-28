package com.candra.kulinernusantara;

import com.candra.kulinernusantara.ModelKuliner;

import java.util.List;

public class ModelResponse {
    private int kode;
    private String pesan;
    private List<ModelKuliner> dataKuliner;

    public int getKode() {
        return kode;
    }

    public String getPesan() {
        return pesan;
    }

    public List<ModelKuliner> getDataKuliner() {
        return dataKuliner;
    }
}
