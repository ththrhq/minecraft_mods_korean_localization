// Decompiled with: CFR 0.152
// Class Version: 8
package iskallia.vault.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Random;

public abstract class Config {
    protected static final Random rand = new Random();
    private static final Gson GSON = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
    protected String root = "config/the_vault/";
    protected String extension = ".json";

    public void generateConfig() {
        this.reset();
        try {
            this.writeConfig();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private File getConfigFile() {
        return new File(this.root + this.getName() + this.extension);
    }

    public abstract String getName();

    public <T extends Config> T readConfig() {
        try {
            return (T)((Config)GSON.fromJson((Reader)new InputStreamReader((InputStream)new FileInputStream(getConfigFile()),"utf-8"), this.getClass()));
        }
        catch (FileNotFoundException e) {
            this.generateConfig();
            return (T)this;
        }
    }

    protected abstract void reset();

    public void writeConfig() throws IOException {
        File dir = new File(this.root);
        if (!dir.exists() && !dir.mkdirs()) {
            return;
        }
        if (!this.getConfigFile().exists() && !this.getConfigFile().createNewFile()) {
            return;
        }
        OutputStreamWriter writer = new OutputStreamWriter((OutputStream)new FileOutputStream(getConfigFile()),"utf-8");
        GSON.toJson((Object)this, (Appendable)writer);
        writer.flush();
        writer.close();
    }
}
