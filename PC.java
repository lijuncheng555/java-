package PCtest;
public class PC {
    private CPU cpu;
    private HardDisk HD;
    PC(CPU cpu){
        setCPU(cpu);
    }
    PC(HardDisk HD){
        setHardDisk(HD);
    }
    public void setCPU(CPU cpu){
        this.cpu = cpu;
    }
    public void setHardDisk(HardDisk HD){
        this.HD = HD;
    }
    void show(){
        System.out.println("CPU���ٶ�:"+cpu.getSpeed());
        System.out.println("CPU������:"+cpu.getType());
        System.out.println("Ӳ�̵�����:"+HD.getAmount());
        System.out.println("Ӳ�̵��ڴ�:"+HD.getMemory());
    }
}
