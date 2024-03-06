interface ТорговыйАвтомат {
    Продукт getProduct(int name, int volume);
    Продукт getProduct(int name, int volume, int temperature);
}

class Продукт {
    private int name;
    private int volume;

    public Продукт(int name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

class ГорячийНапиток extends Продукт {
    private int температура;

    public ГорячийНапиток(int name, int volume, int температура) {
        super(name, volume);
        this.температура = температура;
    }

    public int getТемпература() {
        return температура;
    }

    public void setТемпература(int температура) {
        this.температура = температура;
    }
}

class ГорячихНапитковАвтомат implements ТорговыйАвтомат {
    @Override
    public Продукт getProduct(int name, int volume) {
        return new Продукт(name, volume);
    }

    @Override
    public Продукт getProduct(int name, int volume, int temperature) {
        return new ГорячийНапиток(name, volume, temperature);
    }
}