package com.assin.retrofitdemo.entity;

import java.util.List;

/**
 * Created by Assassin on 2017/6/28.
 */

public class News {
    @Override
    public String toString() {
        return "News{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * code : 0
     * msg : 成功
     * data : {"current_page":1,"data":[{"id":10,"scenic_id":1,"name":"有关三线的记忆","thumb":"weixin/iOvi1250DWhKP1eKw6otPUY8XTqQr5RQBQ4mqERH.png","author":"qianFunAdmin","type":1,"read_num":2,"attention":null,"is_hot":0,"checkstatus":1,"state":0,"sort":0,"remark":"酒店主体系由三线建设时期的天兴仪表厂原址改造而成，房屋材质选取具有历史厚重感的青砖，沿用当年的圆弧屋顶，窗花及遗漏空洞；房间装饰还原三线建设时期的风貌，如毛主席挂像、搪瓷洗脸盆、收音机等，充分保留了三线建设时期的建筑风格，艺术再现了三线建设时期的生活风貌。","deleted_at":null,"created_at":"2017-04-26 13:05:29","updated_at":"2017-06-28 09:26:46","desc":"三线酒店是由旅投集团·重庆山水都市旅游开发有限公司投资兴建的\u201c三线建设\u201d主题文化酒店，位于金佛山西麓天星度假区内，紧邻天星两江假日酒店。","subtitle":"三线酒店"}],"from":1,"last_page":1,"next_page_url":null,"path":"http://weixin.1000fun.com/api/enterprise/scenic/news/index","per_page":10,"prev_page_url":null,"to":1,"total":1}
     */

    private int code;
    private String msg;
    private DataBeanX data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {
        @Override
        public String toString() {
            return "DataBeanX{" +
                    "current_page=" + current_page +
                    ", from=" + from +
                    ", last_page=" + last_page +
                    ", next_page_url=" + next_page_url +
                    ", path='" + path + '\'' +
                    ", per_page=" + per_page +
                    ", prev_page_url=" + prev_page_url +
                    ", to=" + to +
                    ", total=" + total +
                    ", data=" + data +
                    '}';
        }

        /**
         * current_page : 1
         * data : [{"id":10,"scenic_id":1,"name":"有关三线的记忆","thumb":"weixin/iOvi1250DWhKP1eKw6otPUY8XTqQr5RQBQ4mqERH.png","author":"qianFunAdmin","type":1,"read_num":2,"attention":null,"is_hot":0,"checkstatus":1,"state":0,"sort":0,"remark":"酒店主体系由三线建设时期的天兴仪表厂原址改造而成，房屋材质选取具有历史厚重感的青砖，沿用当年的圆弧屋顶，窗花及遗漏空洞；房间装饰还原三线建设时期的风貌，如毛主席挂像、搪瓷洗脸盆、收音机等，充分保留了三线建设时期的建筑风格，艺术再现了三线建设时期的生活风貌。","deleted_at":null,"created_at":"2017-04-26 13:05:29","updated_at":"2017-06-28 09:26:46","desc":"三线酒店是由旅投集团·重庆山水都市旅游开发有限公司投资兴建的\u201c三线建设\u201d主题文化酒店，位于金佛山西麓天星度假区内，紧邻天星两江假日酒店。","subtitle":"三线酒店"}]
         * from : 1
         * last_page : 1
         * next_page_url : null
         * path : http://weixin.1000fun.com/api/enterprise/scenic/news/index
         * per_page : 10
         * prev_page_url : null
         * to : 1
         * total : 1
         */

        private int current_page;
        private int from;
        private int last_page;
        private Object next_page_url;
        private String path;
        private int per_page;
        private Object prev_page_url;
        private int to;
        private int total;
        private List<DataBean> data;

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getLast_page() {
            return last_page;
        }

        public void setLast_page(int last_page) {
            this.last_page = last_page;
        }

        public Object getNext_page_url() {
            return next_page_url;
        }

        public void setNext_page_url(Object next_page_url) {
            this.next_page_url = next_page_url;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public int getPer_page() {
            return per_page;
        }

        public void setPer_page(int per_page) {
            this.per_page = per_page;
        }

        public Object getPrev_page_url() {
            return prev_page_url;
        }

        public void setPrev_page_url(Object prev_page_url) {
            this.prev_page_url = prev_page_url;
        }

        public int getTo() {
            return to;
        }

        public void setTo(int to) {
            this.to = to;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            @Override
            public String toString() {
                return "DataBean{" +
                        "id=" + id +
                        ", scenic_id=" + scenic_id +
                        ", name='" + name + '\'' +
                        ", thumb='" + thumb + '\'' +
                        ", author='" + author + '\'' +
                        ", type=" + type +
                        ", read_num=" + read_num +
                        ", attention=" + attention +
                        ", is_hot=" + is_hot +
                        ", checkstatus=" + checkstatus +
                        ", state=" + state +
                        ", sort=" + sort +
                        ", remark='" + remark + '\'' +
                        ", deleted_at=" + deleted_at +
                        ", created_at='" + created_at + '\'' +
                        ", updated_at='" + updated_at + '\'' +
                        ", desc='" + desc + '\'' +
                        ", subtitle='" + subtitle + '\'' +
                        '}';
            }

            /**
             * id : 10
             * scenic_id : 1
             * name : 有关三线的记忆
             * thumb : weixin/iOvi1250DWhKP1eKw6otPUY8XTqQr5RQBQ4mqERH.png
             * author : qianFunAdmin
             * type : 1
             * read_num : 2
             * attention : null
             * is_hot : 0
             * checkstatus : 1
             * state : 0
             * sort : 0
             * remark : 酒店主体系由三线建设时期的天兴仪表厂原址改造而成，房屋材质选取具有历史厚重感的青砖，沿用当年的圆弧屋顶，窗花及遗漏空洞；房间装饰还原三线建设时期的风貌，如毛主席挂像、搪瓷洗脸盆、收音机等，充分保留了三线建设时期的建筑风格，艺术再现了三线建设时期的生活风貌。
             * deleted_at : null
             * created_at : 2017-04-26 13:05:29
             * updated_at : 2017-06-28 09:26:46
             * desc : 三线酒店是由旅投集团·重庆山水都市旅游开发有限公司投资兴建的“三线建设”主题文化酒店，位于金佛山西麓天星度假区内，紧邻天星两江假日酒店。
             * subtitle : 三线酒店
             */

            private int id;
            private int scenic_id;
            private String name;
            private String thumb;
            private String author;
            private int type;
            private int read_num;
            private Object attention;
            private int is_hot;
            private int checkstatus;
            private int state;
            private int sort;
            private String remark;
            private Object deleted_at;
            private String created_at;
            private String updated_at;
            private String desc;
            private String subtitle;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getScenic_id() {
                return scenic_id;
            }

            public void setScenic_id(int scenic_id) {
                this.scenic_id = scenic_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getRead_num() {
                return read_num;
            }

            public void setRead_num(int read_num) {
                this.read_num = read_num;
            }

            public Object getAttention() {
                return attention;
            }

            public void setAttention(Object attention) {
                this.attention = attention;
            }

            public int getIs_hot() {
                return is_hot;
            }

            public void setIs_hot(int is_hot) {
                this.is_hot = is_hot;
            }

            public int getCheckstatus() {
                return checkstatus;
            }

            public void setCheckstatus(int checkstatus) {
                this.checkstatus = checkstatus;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public Object getDeleted_at() {
                return deleted_at;
            }

            public void setDeleted_at(Object deleted_at) {
                this.deleted_at = deleted_at;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }
        }
    }
}
